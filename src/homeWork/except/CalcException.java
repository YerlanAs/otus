package homeWork.except;

public class CalcException extends Exception {
    private String detailMessage;
    public CalcException(String s) {
        this.detailMessage = s;
    }
    public String getsMessage() {
        return detailMessage;
    }
}
