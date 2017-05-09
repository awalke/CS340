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
public class Trim implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();

        IStringProcessor stringProcessor = StringProcessor.getInstance();
        String response = stringProcessor.trim(BaseHandler.decode(inputStream));

        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
