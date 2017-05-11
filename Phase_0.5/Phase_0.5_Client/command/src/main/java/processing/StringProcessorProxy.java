package processing;

import command.Command;
import communicator.ClientCommunicator;
import results.Results;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class StringProcessorProxy implements IStringProcessor{
    private static StringProcessorProxy instance;
    private ClientCommunicator clientCommunicator;
    private Results results;

    public static StringProcessorProxy getInstance() {
        if (instance == null) {
            instance = new StringProcessorProxy();
        }

        return instance;
    }

    private StringProcessorProxy() {
        clientCommunicator = ClientCommunicator.getInstance();
    }

    public void parseInteger(String string) throws IOException {
        Command command = new Command("parseInt", string);
        results = clientCommunicator.send("parseInt", command);
    }

    public void toLowerCase(String string) throws IOException {
        Command command = new Command("toLowerCase", string);
        results = clientCommunicator.send("toLowerCase", command);
    }

    public void trim(String string) throws IOException {
        Command command = new Command("trim", string);
        results = clientCommunicator.send("trim", command);
    }
}
