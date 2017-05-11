package handlers;

import processing.IStringProcessor;
import processing.StringProcessor;
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
        String jsonString = BaseHandler.encode(response).toString();

        httpExchange.sendResponseHeaders(200, jsonString.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(jsonString.getBytes());
        os.close();
    }
}
