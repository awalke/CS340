package commands;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import results.Results;

import java.io.IOException;

/**
 * Created by awalke on 5/9/17.
 */
public class Command implements ICommand{
    private String type;
    private String str;

    public Command(String type, String str) {
        this.type = type;
        this.str = str;
    }

    public Results execute() {
        ICommand command = null;

        if (type.equals("trim")) {
            command = new TrimCommand(str);
        } else if (type.equals("toLowerCase")) {
            command = new ToLowerCaseCommand(str);
        } else if (type.equals("parseInt")) {
            command = new ParseIntegerCommand(str);
        }
        return command.execute();
    }
}
