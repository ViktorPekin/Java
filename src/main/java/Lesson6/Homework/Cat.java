package Lesson6.Homework;

public class Cat extends Animal{
    static int number;

    public Cat(String name) {
        super(name);
        number++;
    }


    @Override
    public void run(int n) {
        if(n > 200) {
            System.out.println(name + " не может столько пробежать");
        } else if(n >= 0 && n < 200) {
            System.out.println(name + " пробежал " + n + "м");
        }
    }

    @Override
    public void sail(int n) {
        if(n > 0) {
            System.out.println(name + " не умеет плавать");
        }
    }
}
