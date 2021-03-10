package Lesson7.Homework;

import java.util.Scanner;

public class Plate {

    protected int food;

    /*Plate(int food) {
        this.food = food;
    }*/
    public void putFood () {
        System.out.println("Сколько положить корма в миску?");
        Scanner scanner = new Scanner(System.in);
        food = scanner.nextInt();
    }


    public void decreaseFood(int countFoods) {
        if (countFoods <= food) {
            food -= countFoods;
        }
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске: " + food);
    }

}
