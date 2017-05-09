package StringProcessing;

/**
 * Created by awalke on 5/8/17.
 */
public class StringProcessor implements IStringProcessor{

    public String toLowerCase(String givenString) {
        String result = givenString.toLowerCase();
        return result;
    }

    public int parseInteger(String givenString) {
        int result = Integer.parseInt(givenString);
        return result;
    }

    public String trim(String givenString) {
        String result = givenString.trim();
        return result;
    }
}

