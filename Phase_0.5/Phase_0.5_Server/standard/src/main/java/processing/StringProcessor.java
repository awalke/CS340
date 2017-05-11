package processing;

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
        return result;
    }

    public String parseInteger(String givenString) {
        String resultString;

        try {
            int result = Integer.parseInt(givenString);
            resultString = String.valueOf(result);
        } catch(Exception e) {
            resultString = "ERROR: " + e.getMessage() + ". String is not an integer.";
        }

        return resultString;
    }

    public String trim(String givenString) {
        String result = givenString.trim();
        return result;
    }
}

