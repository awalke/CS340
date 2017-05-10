package command;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Command {

    private String name;
    private String str;

    public Command(String name, String str) {
        this.name = name;
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public String getStr() {
        return str;
    }
}
