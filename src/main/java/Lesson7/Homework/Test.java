package Lesson7.Homework;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Martin", false);
        Cat cat2 = new Cat("Васька", false);
        Cat cat3 = new Cat("Мурка", false);
        Cat cat4 = new Cat("Игорь", false);
        Plate plate = new Plate();

        plate.putFood();

        Cat[] catArr = new Cat[]{cat1, cat2, cat3, cat4};

        for (int i = 0; i < catArr.length; i++) {
            catArr[i].eat(plate);
            catArr[i].satietyInfo();
        }
        plate.printInfo();
    }
}