package Handlers;

import StringProcessing.IStringProcessor;
import StringProcessing.StringProcessor;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by allisonwalke on 5/8/17.
 */
public class ToLowerCase implements HttpHandler {
    private JsonObject jsonObject;

//    public ToLowerCase(JsonObject jsonObject) {
//        this.jsonObject = jsonObject;
//    }

    public void handle(HttpExchange httpExchange) throws IOException {
        String response = httpExchange.getRequestHeaders().getFirst("string");
        IStringProcessor stringProcessor = new StringProcessor();
        response = stringProcessor.toLowerCase(response);
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    public String decode() {
        String givenString = jsonObject.get("string").toString();
        return givenString;
    }
}
