package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int randomNumber = (int)(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9");

        for (int i = 0; i < 3; i++) {

            int number = scanner.nextInt();
            if (randomNumber == number) {
                System.out.println("Победа! Повторить игру еще раз? 1 - да / 0 - нет");
                int exit = scanner.nextInt();
                if (exit == 1) {
                    task1();
                } else {
                    break;
                }
            } else {
                if (number < randomNumber) {
                    System.out.println("Число больше");
                } else {
                    System.out.println("Число меньше");
                }
            }
        }
        System.exit(0);
    }
}
