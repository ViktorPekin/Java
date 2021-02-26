package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        for ( ; ; ) {
            int randomNumber = (int)(Math.random() * 10);
            System.out.println("Введите число от 0 до 9");
            for (int j = 0; j < 3; j++) {
                int number = scanner.nextInt();
                if (randomNumber == number) {
                    System.out.println("Победа! Повторить игру еще раз? 1 - да / 0 - нет");
                    int exit = scanner.nextInt();
                    if (exit == 1) {
                        break;
                    } else {
                        return;
                    }
                } else {
                    if (j == 2) {
                        System.out.println("Проигрыш =( Повторить игру еще раз? 1 - да / 0 - нет");
                        int exit = scanner.nextInt();
                        if (exit == 1) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        if (number < randomNumber) {
                            System.out.println("Число больше");
                        } else {
                            System.out.println("Число меньше");
                        }
                    }
                }
            }
        }
    }

    private static void task2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomWordNumber = (int)(Math.random() * words.length);
        Scanner scanner = new Scanner(System.in);
        char[] compare = new char[15];

        for (int i = 0; i < words.length; i++) {
            String randomWord = words[randomWordNumber];
            String word = scanner.next();
            System.out.println(randomWord.length() + randomWord);
            if (randomWord == word) {
                System.out.println("Красава!");
                return;
            } else {
                int most = randomWord.length() <= word.length() ? word.length() : randomWord.length();
                for (int j = 0; j < most; j++) {

                    if (randomWord.charAt(j) == word.charAt(j)) {
                        compare[j] = randomWord.charAt(j);
                    } else {
                        compare[j] = '*';
                    }

                }
            }
            System.out.println(Arrays.toString(compare));


        }

    }
}
