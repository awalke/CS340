package Handlers;

import StringProcessing.IStringProcessor;
import StringProcessing.StringProcessor;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.oracle.javafx.jmx.json.JSONFactory;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;

/**
 * Created by allisonwalke on 5/8/17.
 */
public class ToLowerCase implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();

        StringProcessor processor = StringProcessor.getInstance();
        String response = processor.toLowerCase(BaseHandler.decode(inputStream));

        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
