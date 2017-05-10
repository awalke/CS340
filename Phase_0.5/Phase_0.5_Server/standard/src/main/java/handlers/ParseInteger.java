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
public class ParseInteger implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();

        IStringProcessor processor = StringProcessor.getInstance();
        String response = String.valueOf(processor.parseInteger(BaseHandler.decode(inputStream)));

        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}