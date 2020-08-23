public class MyArrayDataExeption extends NumberFormatException{
    String a;
    int b;
    int c;
    public MyArrayDataExeption(String a) {
        this.a = a;
    }
    public MyArrayDataExeption(String s, String a) {
        super(s);
        this.a = a;
    }
    public MyArrayDataExeption(String s, int b, int c) {
        super(s);
        this.b = b;
        this.c = c;
    }
    public String getA() {
        return a;
    }
}
