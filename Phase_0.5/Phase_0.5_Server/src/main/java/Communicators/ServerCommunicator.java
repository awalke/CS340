package Communicators;

import Handlers.ParseInteger;
import Handlers.ToLowerCase;
import Handlers.Trim;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

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

//    public void send(String urlSuffix, JsonObject jsonString) throws IOException{
//        if (urlSuffix.equals("/toLowerCase")) {
//            server.createContext("/toLowerCase", new ToLowerCase(jsonString));
//        }
//    }
}
