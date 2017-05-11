import processing.StringProcessorProxy;

/**
 * Created by allisonwalke on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            StringProcessorProxy proxy = StringProcessorProxy.getInstance();
            proxy.toLowerCase("HELLO WORLD");
            proxy.trim("     HELLO WORLD    ");
            proxy.parseInteger("-12");
            proxy.parseInteger("HELLO WORLD");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
