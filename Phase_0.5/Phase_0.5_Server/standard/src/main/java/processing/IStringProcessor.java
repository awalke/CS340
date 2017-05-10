package processing;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/8/17.
 */
public interface IStringProcessor {
    String toLowerCase(String givenString) throws IOException;

    int parseInteger(String givenString) throws IOException;

    String trim(String givenString) throws IOException;
}
