package serializer;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import command.Command;
import results.Results;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Serializer {
    public static String serializeObject(Command command) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", command.getType());
        jsonObject.addProperty("string", command.getString());
        String jsonString = jsonObject.toString();

        return jsonString;
    }

    public static Results deserializeResults(String str) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(str).getAsJsonObject();

        boolean success = jsonObject.get("success").getAsBoolean();
        String data = jsonObject.get("data").getAsString();
        String errorInfo = jsonObject.get("errorInfo").getAsString();

        Results results = new Results(success, data, errorInfo);

        return results;
    }
}
