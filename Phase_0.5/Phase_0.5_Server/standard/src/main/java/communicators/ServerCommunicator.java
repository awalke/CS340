package communicators;

import handlers.ParseInteger;
import handlers.ToLowerCase;
import handlers.Trim;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by awalke on 5/8/17.
 */
public class ServerCommunicator{

    private HttpServer server;

    public ServerCommunicator() throws IOException {
        server = server.create(new InetSocketAddress(8080), 0);
        server.createContext("/toLowerCase", new ToLowerCase());
        server.createContext("/trim", new Trim());
        server.createContext("/parseInt", new ParseInteger());
        server.start();
    }
}
