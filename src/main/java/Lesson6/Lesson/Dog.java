package Lesson6.Lesson;

public class Dog extends Animal {

    protected String name;

    protected boolean isBark;

    public Dog(String name, String color, int age, boolean isBark) {
        super(name, color, age);
        this.isBark = isBark;
        this.name = name + "-кун";
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Гау гау");
    }

    @Override
    public String toString() {
        return super.toString() + "\nisBark = " + isBark + "Домашнее имя: " + this.name;
    }

    public void doBark() {
        System.out.println("ГАВГАВ");
    }
}
