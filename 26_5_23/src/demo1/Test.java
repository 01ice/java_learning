package demo1;

public class Test {
    // 2. ⽅法传参：形参为⽗类型引⽤，可以接收任意⼦类的对象
    public static void eatFood(Animal a) {
        a.eat();
    }

    // 3.作返回值：返回任意⼦类对象
    public static Animal buyAnimal(String var){
        if("狗".equals(var) ){
            return new Dog("狗狗",1);
        }else if("猫" .equals(var)){
            return new Cat("猫猫", 1);
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        /*Dog dog = new Dog("旺财",5);
        Cat cat = new Cat("小黑",2);
        eatFood(dog);
        eatFood(cat);*/
        //Animal animal = new Dog("旺财",5);
        /*Dog dog = new Dog("旺财",5);
        Cat cat = new Cat("小黑",2);
        Animal animal = dog;
        animal.eat();
        dog = (Dog)animal;
        dog.bark();*/


    }
}
