package Lesson5.homework;

public class Main {
    public static void main(String[] args) {
        Employee[] personArr = new Employee[5];
        personArr[0] = new Employee("Lidov Ivan Petrovih", "frontend", 45678, 30000, 25);
        personArr[1] = new Employee("Petkin Vadim ivanov", "backend", 48695, 40000, 44);
        personArr[2] = new Employee("Larin Goha Romanov", "frontend", 47536, 35000, 30);
        personArr[3] = new Employee("Kolkin Sergei Vadimovith", "teamLid", 42456, 60000, 42);
        personArr[4] = new Employee("kitov Igor Viktorovih", "director", 40404, 90000, 50);

        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].age >= 40) {
                personArr[i].printInfo();
            }
        }
    }
}
