package homeWork.except;

public class TaskManagerException extends Exception {
    private String detailMessage;
    public TaskManagerException(String s) {
        this.detailMessage = s;
    }
    public String getsMessage() {
        return detailMessage;
    }
}
