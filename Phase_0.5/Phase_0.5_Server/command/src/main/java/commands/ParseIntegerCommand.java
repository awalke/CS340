package commands;

import processors.StringProcessor;
import results.Results;

/**
 * Created by awalke on 5/9/17.
 */
public class ParseIntegerCommand implements ICommand{
    private String str;

    public ParseIntegerCommand(String str) {
        this.str = str;
    }

    public Results execute() {
        StringProcessor processor = StringProcessor.getInstance();
        String result = processor.parseInteger(str);
        Results results = null;

        if (result.contains("ERROR")) {
            results = new Results(false, "none", result);
        } else {
            results = new Results(true, result, "none");
        }



        return results;
    }
}
