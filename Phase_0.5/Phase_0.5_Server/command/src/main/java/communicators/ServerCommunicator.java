package communicators;

import com.sun.net.httpserver.HttpServer;
import handlers.ExecCommandHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by awalke on 5/9/17.
 */
public class ServerCommunicator {
    private HttpServer server;

    public ServerCommunicator() throws IOException {
        server = server.create(new InetSocketAddress(8080), 0);
        server.createContext("/toLowerCase", new ExecCommandHandler());
        server.createContext("/trim", new ExecCommandHandler());
        server.createContext("/parseInt", new ExecCommandHandler());
        server.start();
    }
}
