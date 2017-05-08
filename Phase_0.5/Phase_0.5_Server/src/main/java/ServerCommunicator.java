import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

/**
 * Created by awalke on 5/8/17.
 */
public class ServerCommunicator extends HttpServer {

    public void bind(InetSocketAddress inetSocketAddress, int i) throws IOException {
        
    }

    public void start() {

    }

    public void setExecutor(Executor executor) {

    }

    public Executor getExecutor() {
        return null;
    }

    public void stop(int i) {

    }

    public HttpContext createContext(String s, HttpHandler httpHandler) {
        return null;
    }

    public HttpContext createContext(String s) {
        return null;
    }

    public void removeContext(String s) throws IllegalArgumentException {

    }

    public void removeContext(HttpContext httpContext) {

    }

    public InetSocketAddress getAddress() {
        return null;
    }
}
