package Handlers;

import StringProcessing.IStringProcessor;
import StringProcessing.StringProcessor;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by allisonwalke on 5/8/17.
 */
public class ParseInteger implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();

        JsonObject jsonObject = decode(inputStream);

        IStringProcessor stringProcessor = new StringProcessor();
        String response = String.valueOf(stringProcessor.parseInteger(jsonObject.get("string").getAsString()));

        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    public JsonObject decode(InputStream inputStream) {
        java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        JsonParser jsonParser = new JsonParser();
        JsonObject jo = (JsonObject)jsonParser.parse(result);

        return jo;
    }
}
