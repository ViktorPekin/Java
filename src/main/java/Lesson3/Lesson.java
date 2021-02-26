package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        teststring();
        testInput();
    }

    private static void teststring() {
        String str1 = "Java";
        String str3 = new String("Java");

        System.out.println(str1.equals(str3));   // Сравнение значений переменных
    }

    private static void testInput() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);

        var reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello, " + name);


    }

}
