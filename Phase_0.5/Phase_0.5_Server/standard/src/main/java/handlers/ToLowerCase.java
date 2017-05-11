package handlers;

import processing.StringProcessor;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by allisonwalke on 5/8/17.
 */
public class ToLowerCase implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();

        StringProcessor processor = StringProcessor.getInstance();
        String response = processor.toLowerCase(BaseHandler.decode(inputStream));
        String jsonString = BaseHandler.encode(response).toString();
        System.out.println(jsonString);

        httpExchange.sendResponseHeaders(200, jsonString.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(jsonString.getBytes());
        os.close();
    }
}
