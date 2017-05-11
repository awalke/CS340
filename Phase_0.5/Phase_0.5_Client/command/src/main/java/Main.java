import processing.StringProcessorProxy;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        StringProcessorProxy proxy = StringProcessorProxy.getInstance();
        proxy.toLowerCase("HELLO WORLD");
        proxy.trim("     HELLO WORLD    ");
        proxy.parseInteger("-12");
        proxy.parseInteger("HELLO WORLD");
        try {

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
