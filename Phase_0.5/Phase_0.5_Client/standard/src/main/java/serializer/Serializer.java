package serializer;

import com.google.gson.JsonObject;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Serializer {

    public static JsonObject encode(Object requestInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("string", requestInfo.toString());

        return jsonObject;
    }
}
