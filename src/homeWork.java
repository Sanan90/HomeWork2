import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class homeWork {
    String[][] a;
    int sum = 0;


    public homeWork(String[][] a) throws MyArraySizeException, MyArrayDataExeption, NumberFormatException {
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4 || a.length != 4) {
                throw new MyArraySizeException(a);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                try {
                    sum += Integer.valueOf(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("a[" + i + "][" + j + "]") {
                    };
                }
            }
        }
        System.out.println(sum);
    }
}
