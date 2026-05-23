package demo1;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 在吃猫粮");
    }

    public void mew() {
        System.out.println("猫叫");
    }
}
