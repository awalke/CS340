package results;

/**
 * Created by awalke on 5/9/17.
 */
public class Results {

    private boolean success;
    private String data;
    private String errorInfo;

    public Results(boolean success, String data, String errorInfo) {
        this.success = success;
        this.data = data;
        this.errorInfo = errorInfo;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getData() {
        return data;
    }

    public String getErrorInfo() {
        return errorInfo;
    }
}
