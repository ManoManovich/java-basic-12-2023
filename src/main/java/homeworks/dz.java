package homeworks;

public class dz {
    public static void main(String[] args) {
        greetings();
        checkSign(-100, 3, 5);
        selectColor();
        Numbers();
        addOrSubtractAndPrint(5, 20, true);
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
            System.out.println("сумма положительная");
        } else {
            System.out.println("число отрицательное");
        }

    }

    public static void selectColor() {
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

    public static void Numbers() {
        int a = 1;
        int b = 10;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    public static void addOrSubtractAndPrint (int delta, int initValue, boolean increment) {
        if (increment) {
            System.out.println(delta + initValue);
        }else {
            System.out.println(delta - initValue);
        }

    }
}