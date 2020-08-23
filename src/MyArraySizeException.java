public class MyArraySizeException extends IndexOutOfBoundsException {
    private String[][] a;

    public MyArraySizeException(String[][] a) {
        this.a = a;
    }

    public MyArraySizeException(String s) {
        super(s);
    }
}
