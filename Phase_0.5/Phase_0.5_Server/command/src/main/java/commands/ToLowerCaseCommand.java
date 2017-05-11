package commands;

import processors.StringProcessor;
import results.Results;

/**
 * Created by awalke on 5/9/17.
 */
public class ToLowerCaseCommand implements ICommand{
    private String str;

    public ToLowerCaseCommand(String str) {
        this.str = str;
    }

    public Results execute() {
        StringProcessor processor = StringProcessor.getInstance();
        String result = processor.toLowerCase(str);

//        System.out.println(result);

        Results results = new Results(true, result, "none");

        return results;
    }
}
