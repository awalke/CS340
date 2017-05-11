package processors;

/**
 * Created by awalke on 5/9/17.
 */
public class StringProcessor implements IStringProcessor {
    private static StringProcessor instance;

    public static StringProcessor getInstance() {
        if (instance == null) {
            instance = new StringProcessor();
        }

        return instance;
    }

    private StringProcessor() {

    }

    public String toLowerCase(String s) {
        String result = s.toLowerCase();

        return result;
    }

    public String trim(String s) {
        String result = s.trim();

        return result;
    }

    public String parseInteger(String s) {
        String resultString;

        try {
            int result = Integer.parseInt(s);
            resultString = String.valueOf(result);
        } catch(Exception e) {
            resultString = "ERROR: " + e.getMessage() + ". String is not an integer.";
        }

        return resultString;
    }
}
