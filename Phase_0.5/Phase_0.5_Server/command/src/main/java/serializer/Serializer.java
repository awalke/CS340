package serializer;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import commands.Command;
import results.Results;

/**
 * Created by awalke on 5/9/17.
 */
public class Serializer {

    public static String serializeResults(Results r) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("success", r.isSuccess());
        jsonObject.addProperty("data", r.getData());
        jsonObject.addProperty("errorInfo", r.getErrorInfo());

        String jsonString = jsonObject.toString();

        return jsonString;
    }

    public static Command deserializeCommand(String str){
//        System.out.println(str);

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(str).getAsJsonObject();

        String type = jsonObject.get("type").getAsString();
        String string = jsonObject.get("string").getAsString();

        Command command = new Command(type, string);

        return command;
    }
}
