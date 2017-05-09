package Communicators;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by allisonwalke on 5/9/17.
 */
public class ClientCommunicator {
    public void send(String urlPath, Object requestInfo) throws IOException {
        String url = "http://localhost:8080" + urlPath;
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestProperty("string", requestInfo.toString());
        InputStream response = connection.getInputStream();

        try (Scanner scanner = new Scanner(response)) {
            String responseBody = scanner.useDelimiter("\\A").next();
            System.out.println(responseBody);
        }
    }
}
