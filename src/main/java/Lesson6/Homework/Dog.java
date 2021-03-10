package Lesson6.Homework;

public class Dog extends Animal{
    static int number;

    public Dog(String name) {
        super(name);
        number++;
    }

    @Override
    public void run(int n) {
        if(n > 500) {
            System.out.println(name + " не может столько пробежать");
        } else if(n >= 0 && n < 500) {
            System.out.println(name + " пробежал " + n + "м");
        }
    }

    @Override
    public void sail(int n) {
        if(n > 10) {
            System.out.println(name + " не может столько проплыть");
        } else if(n >= 0 && n < 10) {
            System.out.println(name + " проплыл " + n + "м");
        }
    }
}
