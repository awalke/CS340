package Communicators;

import com.google.gson.*;
import org.omg.PortableInterceptor.RequestInfo;

/**
 * Created by awalke on 5/8/17.
 */

public class ClientCommunicator {
    private ServerCommunicator serverCommunicator;

    public ClientCommunicator() {
        serverCommunicator = new ServerCommunicator();
    }

    public void send(String urlSuffix, String requestInfo){
        JsonObject jsonObject = encode(requestInfo);
        serverCommunicator.send(urlSuffix, jsonObject);
    }

    public JsonObject encode(String requestInfo){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("string", requestInfo);
        return jsonObject;
    }
}
