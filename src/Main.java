public class Main {
    public static void main(String[] args) {
        String[][] a = {
                {"2","3","4","5"},
                {"6","5","4","3"},
                {"7","18","3","6"},
                {"8","3","5","18"}
        };

        try {
            new homeWork(a);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Длина массива меньше или больше необходимого");
        }   catch (MyArrayDataExeption e) {
            e.printStackTrace();
            System.out.print("Ошибка!!! В поле ");
            System.out.print(e.getA() + " ");
            System.out.println("введена не цифра");
        }


    }
}
