package Lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        int[] arr6 = {1, 1, 1, 1, 1, 1, 10, 0};
        System.out.println(task6(arr6));
    }

    private static void task1() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task2() {
        int a = 0;
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + a;
            a = a + 3;
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void task3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    private static void task4() {
        int a = 6;
        int[][] doubleArr1 = new int[a][a];
        for (int i = 0; i < doubleArr1.length; i++) {
            a--;
            for (int j = 0; j < doubleArr1.length; j++) {
                if (j == i || j == a) {
                    doubleArr1[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < doubleArr1.length; i++) {              // Вывод
            for (int j = 0; j < doubleArr1.length; j++) {
                System.out.printf("%3d", doubleArr1[i][j]);
            }
            System.out.println();
        }
    }

    private static void task5() {
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(arr5);
        System.out.println("Минимальное число в массиве:" + arr5[0]);
        System.out.println("Максимальное число в массиве:" + arr5[arr5.length - 1]);
    }

    private static boolean task6(int[] arr6) {
        int start = arr6[0];
        int end = arr6[arr6.length - 1];
        int per1 = 0;
        int per2 = 1;
        boolean result = false;
        for (int i = 0; i < arr6.length; i++) {
            if (start != end) {
                if (start < end) {
                    per1++;
                    start = start + arr6[per1];
                } else {
                    per2++;
                    end = end + arr6[arr6.length - per2];
                }

            } else {
                result = true;
            }
        }
        return result;
    }
}
