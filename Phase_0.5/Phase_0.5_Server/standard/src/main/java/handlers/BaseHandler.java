package handlers;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;

/**
 * Created by awalke on 5/9/17.
 */
public class BaseHandler {

    public static String decode(InputStream inputStream) {
        java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        JsonParser jsonParser = new JsonParser();
        JsonObject jo = (JsonObject)jsonParser.parse(result);

        return jo.get("string").getAsString();
    }

    public static JsonObject encode(String responseString) {
        return null;
    }
}
