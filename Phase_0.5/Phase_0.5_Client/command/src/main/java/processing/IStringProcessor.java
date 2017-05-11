package processing;

import java.io.IOException;

/**
 * Created by allisonwalke on 5/10/17.
 */
public interface IStringProcessor {
    public void parseInteger(String string) throws IOException;
    public void toLowerCase(String string) throws IOException;
    public void trim(String string) throws IOException;
}
