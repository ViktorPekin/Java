package Lesson5.homework;

public class Employee {

    protected String name;
    protected String position;
    protected int tel;
    protected int pay;
    protected int age;

    public Employee(String name, String position, int tel, int pay, int age) {
        this.name = name;
        this.position = position;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }

    public void printInfo () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "ФИО=" + name + ", Должнось=" + position  + ", Телефон=" + tel + ", Зарплата=" + pay + ", Возраст=" + age;
    }

}


