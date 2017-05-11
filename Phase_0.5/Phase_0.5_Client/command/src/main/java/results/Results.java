package results;

/**
 * Created by allisonwalke on 5/10/17.
 */
public class Results {
    private boolean success;
    private String data;
    private String errorInfo;

    public Results (boolean success, String data, String errorInfo) {
        this.success = success;
        this.data = data;
        this.errorInfo = errorInfo;
    }
}
