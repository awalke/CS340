package command;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Command {

    private String type;

    private String string;

    public Command(String type, String string) {
        this.type = type;
        this.string = string;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
