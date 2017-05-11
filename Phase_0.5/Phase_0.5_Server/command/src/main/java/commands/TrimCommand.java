package commands;

import processors.StringProcessor;
import results.Results;

/**
 * Created by awalke on 5/9/17.
 */
public class TrimCommand implements ICommand {
    private String str;

    public TrimCommand(String str) {
        this.str = str;
    }

    public Results execute() {
        StringProcessor processor = StringProcessor.getInstance();
        String result = processor.trim(str);

        Results results = new Results(true, result, "none");

        return results;
    }
}
