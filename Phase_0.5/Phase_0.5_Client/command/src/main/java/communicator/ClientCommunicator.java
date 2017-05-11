package communicator;

import com.google.gson.JsonObject;
import command.Command;
import results.Results;
import serializer.Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class ClientCommunicator {
    private static ClientCommunicator instance;

    public static ClientCommunicator getInstance() {
        if (instance == null) {
            instance = new ClientCommunicator();
        }

        return instance;
    }

    private ClientCommunicator() {

    }

    public Results send(String urlSuffix, Command command) throws IOException {
        String jsonString = Serializer.serializeObject(command);

        String url = "http://localhost:8080/" + urlSuffix;

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setRequestMethod("GET");

        OutputStream os = connection.getOutputStream();
        os.write(jsonString.getBytes());
        os.close();

        InputStream response = connection.getInputStream();

        Scanner scanner = new Scanner(response);
        String responseBody = scanner.useDelimiter("\\A").next();
        System.out.println(responseBody);

        Results results = Serializer.deserializeResults(responseBody);

        return results;
    }
}
