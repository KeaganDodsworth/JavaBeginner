package Lesson13.JavaIOFundamentals.JavaIOFundamentals;

public class StockException extends Exception {
    private static final long serialVersionUID = 103L;
    public StockException (String reason) {
        super (reason);
    }
}
