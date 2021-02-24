package Lesson1;

public class main {
    public static void main(String[] args) {
        variables();
        task3(2, 5, 7, 3);
        task4(12, 5);
        task5(0);
        task6(5);
        task7("Виктор");
        task8(2021);
    }

    public static void variables(){
        byte varByte = 0;
        short varShort = 2;
        int varInt = 2;
        long varLong = 2;
        float varFloat = 2.2f;
        double varDouble = 2.2;
        char varChar = 1000;
        boolean varBoolean = false;
    }

    private static float task3(int a, int b, float c, int d) {
        return (a * (b + (c / d)));
    }

    private static boolean task4(int a, int b){
        if (a + b >= 10 & a + b <= 20) {
            return (true);
        } else {
            return (false);
        }
    }

    private static void task5(int i) {
        if (i < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static boolean task6(int i) {
        if (i < 0) {
            return (true);
        } else {
            return (false);
        }
    }

    private static void task7(String i) {
        System.out.println("Привет," + " " + i + "!");
    }

    private static void task8(int i) {
        if (i % 4 != 0 | i % 400 == 0 ^ i % 100 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }
    }
}
