package Lesson2;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        System.out.println(season(4));
       // forTest();
       // whileTest();
        arrTest();

    }

    private static String season(int i) {
        return switch (i) {
            case 1 -> "winter";
            case 2 -> "spring";
            case 3 -> "summer";
            case 4 -> "fall";
            default -> "Unknown season";
        };
    }

    private static void forTest() {
        for(int i = 0; i < 50; i++){

            if (i==15) {
                break;              // Остановка
            }

            if (i % 2 == 0) {
                continue;           // Пропуск
            }

            System.out.println(i);
        }
    }

    private static void whileTest() {
        int i = 1000;
        while (i<10){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
        } while (i < 10);
    }

    private static void arrTest() {
        int[] data = new int[5];

        data[0] = 3;
        data[3] = 5;
        data[4] = 4;


        System.out.println(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        Arrays.sort(data);                           // сортировка
        System.out.println(Arrays.toString(data));   // вывод массива
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5,6,7}));     //создание и вывод саммива

        int[][] deepData = new int[7][7];                       //Создание  двумерного массива
        int n = 0;
        for (int i = 0; i < deepData.length; i++) {             //Заполнение двумерного массива
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }

        for (int i = 0; i < deepData.length; i++) {             //Вывод двумерного массива
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);
            }
            System.out.println();
        }
    }

}
