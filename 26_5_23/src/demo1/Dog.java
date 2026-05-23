package demo1;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 在吃狗粮");
    }

    public void bark() {
        System.out.println("狗叫");
    }
}
