import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by awalke on 5/8/17.
 */
public class Test implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException {
        String response = "Hello World";
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
