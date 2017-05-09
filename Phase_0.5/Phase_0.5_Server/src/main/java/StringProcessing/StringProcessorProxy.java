package StringProcessing;

import Communicators.ClientCommunicator;

/**
 * Created by awalke on 5/8/17.
 */
public class StringProcessorProxy implements IStringProcessor{
    private ClientCommunicator clientCommunicator;

    public StringProcessorProxy() {
        clientCommunicator = new ClientCommunicator();
    }

    public void toLowerCase(String givenString) {
        clientCommunicator.send("/toLowerCase", givenString);
    }

    public void parseInteger(String givenString) {
        clientCommunicator.send("/parseInt", givenString);
    }

    public void trim(String givenString) {
        clientCommunicator.send("/trim", givenString);
    }
}
