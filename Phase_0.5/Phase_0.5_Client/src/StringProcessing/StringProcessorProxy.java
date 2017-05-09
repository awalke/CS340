package StringProcessing;

import Communicators.ClientCommunicator;

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
        clientCommunicator = new ClientCommunicator();
    }

    @Override
    public void parseInteger(String string) throws IOException {
        clientCommunicator.send("/parseInt", string);
    }

    @Override
    public void toLowerCase(String string) throws IOException {
        clientCommunicator.send("/toLowerCase", string);
    }

    @Override
    public void trim(String string) throws IOException {
        clientCommunicator.send("/trim", string);
    }
}
