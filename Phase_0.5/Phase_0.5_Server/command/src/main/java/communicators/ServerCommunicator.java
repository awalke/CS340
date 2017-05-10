package communicators;

import com.sun.net.httpserver.HttpServer;
import commands.Command;
import handlers.ParseIntegerHandler;
import handlers.ToLowerCaseHandler;
import handlers.TrimHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by awalke on 5/9/17.
 */
public class ServerCommunicator {
    private HttpServer server;

    public ServerCommunicator() throws IOException {
        server = server.create(new InetSocketAddress(8080), 0);
        server.createContext("/toLowerCase", new ToLowerCaseHandler());
        server.createContext("/trim", new TrimHandler());
        server.createContext("/parseInt", new ParseIntegerHandler());
        server.start();
    }
}
