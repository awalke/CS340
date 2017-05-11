package handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import commands.Command;
import results.Results;
import serializer.Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by awalke on 5/9/17.
 */
public class ExecCommandHandler implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream inputStream = httpExchange.getRequestBody();
        Scanner scanner = new Scanner(inputStream);
        String responseBody = scanner.useDelimiter("\\A").next();

        Command command = Serializer.deserializeCommand(responseBody);
        Results results = command.execute();
        String response = Serializer.serializeResults(results);

        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
