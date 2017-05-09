package StringProcessing;
import Communicators.ClientCommunicator;
import org.omg.PortableInterceptor.ClientRequestInfo;
import org.omg.PortableInterceptor.RequestInfo;

/**
 * Created by awalke on 5/8/17.
 */
public class StringProcessor implements IStringProcessor{
    ClientCommunicator clientCommunicator;

    protected StringProcessor() {
        clientCommunicator = new ClientCommunicator();
    }

    public void toLowerCase(String givenString) {
    }

    public void parseInteger(String givenString) {
    }

    public void trim(String givenString) {
    }
}

