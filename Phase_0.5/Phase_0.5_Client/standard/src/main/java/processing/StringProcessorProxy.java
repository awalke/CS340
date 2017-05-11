package processing;

import communicator.ClientCommunicator;
import java.io.IOException;

/**
 * Created by allisonwalke on 5/9/17.
 */
public class StringProcessorProxy implements IStringProcessor {
    private ClientCommunicator clientCommunicator;
    private static StringProcessorProxy instance;

    public static StringProcessorProxy getInstance() throws IOException {
        if (instance == null) {
            instance = new StringProcessorProxy();
        }

        return instance;
    }

    private StringProcessorProxy() throws IOException {
        clientCommunicator = ClientCommunicator.getInstance();
    }

    public void parseInteger(String string) throws IOException {
        clientCommunicator.send("/parseInt", string);
    }

    public void toLowerCase(String string) throws IOException {
        clientCommunicator.send("/toLowerCase", string);
    }

    public void trim(String string) throws IOException {
        clientCommunicator.send("/trim", string);
    }
}
