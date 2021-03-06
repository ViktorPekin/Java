package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            int randomNumber = (int) (Math.random() * 10);
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
        int randomWordNumber = (int) (Math.random() * words.length);
        Scanner scanner = new Scanner(System.in);
        char[] compare = new char[15];
        String randomWord = words[randomWordNumber];

        for (; ; ) {
            String word = scanner.next();
            if (randomWord.equals(word)) {
                System.out.println("Красава!");
                return;
            } else {
                for (int j = 0; j < compare.length; j++) {
                    if (randomWord.length() <= j || word.length() <= j) {
                        compare[j] = '#';
                    } else {
                        if (randomWord.charAt(j) != word.charAt(j)) {
                            compare[j] = '#';
                        } else {
                            compare[j] = randomWord.charAt(j);
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(compare));
        }
    }
}
