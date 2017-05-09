package StringProcessing;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/8/17.
 */
public interface IStringProcessor {
    public String toLowerCase(String givenString) throws IOException;

    public int parseInteger(String givenString) throws IOException;

    public String trim(String givenString) throws IOException;
}
