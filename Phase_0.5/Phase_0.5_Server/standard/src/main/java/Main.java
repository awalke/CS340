import communicators.ServerCommunicator;

/**
 * Created by awalke on 5/8/17.
 */
public class Main {
    public static void main(String[] args) throws Exception{
//        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
//        server.createContext("/test", new Test());
//        server.start();
        ServerCommunicator server = new ServerCommunicator();

    }
}
