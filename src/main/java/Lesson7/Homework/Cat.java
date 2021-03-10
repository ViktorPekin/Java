package Lesson7.Homework;


public class Cat {
    protected String name;
    protected boolean satiety;

    public Cat(String name, boolean satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        int n = 4;
        if (n <= plate.food) {
            satiety = true;
            plate.decreaseFood(n);
        } else {
            plate.decreaseFood(0);
        }
    }

    public void satietyInfo() {
        String info = (satiety) ? "сытый" : "голоден";
        System.out.println(name + " " + info);
    }

}
