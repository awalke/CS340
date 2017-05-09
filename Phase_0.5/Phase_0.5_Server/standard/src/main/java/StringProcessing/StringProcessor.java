package StringProcessing;

/**
 * Created by awalke on 5/8/17.
 */
public class StringProcessor implements IStringProcessor{

    private static StringProcessor instance;

    public static StringProcessor getInstance() {
        if (instance == null) {
            instance = new StringProcessor();
        }

        return instance;
    }

    private StringProcessor() {

    }

    public String toLowerCase(String givenString) {
        String result = givenString.toLowerCase();
        System.out.println(result);
        return result;
    }

    public int parseInteger(String givenString) {
        int result = Integer.parseInt(givenString);
        System.out.println(result);
        return result;
    }

    public String trim(String givenString) {
        String result = givenString.trim();
        System.out.println(result);
        return result;
    }
}

