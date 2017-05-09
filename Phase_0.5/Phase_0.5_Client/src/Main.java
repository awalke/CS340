import StringProcessing.IStringProcessor;
import StringProcessing.StringProcessorProxy;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            IStringProcessor proxy = StringProcessorProxy.getInstance();
            proxy.toLowerCase("HELLO WORLD");
            proxy.trim("     HELLO WORLD    ");
            proxy.parseInteger("-12");
            proxy.parseInteger("HELLO WORLD");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
