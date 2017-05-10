package communicators;

import com.google.gson.JsonObject;
import command.Command;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by allisonwalke on 5/9/17.
 */
public class ClientCommunicatorCommand {
    public void send(String urlPath, Command command) throws IOException {
        String url = "http://localhost:8080" + urlPath;

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        JsonObject jsonObject = encode(command);
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setRequestMethod("GET");

        OutputStream os = connection.getOutputStream();
        os.write(jsonObject.toString().getBytes());
        os.close();

        InputStream response = connection.getInputStream();

        try (Scanner scanner = new Scanner(response)) {
            String responseBody = scanner.useDelimiter("\\A").next();
            System.out.println(responseBody);
        }
    }

    public JsonObject encode(Command command) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("string", command.getStr());

        return jsonObject;
    }
}
