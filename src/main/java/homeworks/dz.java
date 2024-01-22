package homeworks;

public class dz {
    public static void main (String[] args) {
        greetings();
        checkSign(-100, 3, 5);
        selectColor();
    }

    public static void greetings() {
        System.out.println("hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println ("сумма положительная");
        } else {
            System.out.println ("число отрицательное");}

    }
    public static void selectColor () {
        int data = 21;
        if (data <= 10) {
            System.out.println("красный");
        }
        if (data >= 10 && data <= 20) {
            System.out.println("желтый");
        }
        if (data > 20) {
            System.out.println("зеленый");
        }
    }
}
