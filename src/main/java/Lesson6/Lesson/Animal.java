package Lesson6.Lesson;

public abstract class Animal extends Object {

    protected String name;
    private String color;
     int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name) {
        this(name, "Серобурмалиновое", 0);
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }

    public abstract void voice();

    public final void printInfo() {
        System.out.println(this.toString());
    }


}
