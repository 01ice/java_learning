public class Test {
    public static void main(String[] args) {
        //Derived d = new Derived();
        Person student1 = new Student("cyy",10);
        System.out.println("============================");
        Person student2 = new Student("cy",20);
    }
}

/*class Base {
    public Base(int a){
        System.out.println("Base()：" + a);
    }
}
class Derived extends Base{
    public Derived(){
        super(10);//此时通过super(参数)的形式
        System.out.println("Derived()");
    }
}*/

/*
class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造⽅法执⾏");
    }
    {
        System.out.println("实例代码块执⾏");
    }

    static {
        System.out.println("静态代码块执⾏");
    }
}*/

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person：构造⽅法执⾏");
    }

    {
        System.out.println("Person：实例代码块执⾏");
    }

    static {
        System.out.println("Person：静态代码块执⾏");
    }
}
class Student extends Person{
    public Student(String name,int age) {
        super(name,age);
        System.out.println("Student：构造⽅法执⾏");
    }

    {
        System.out.println("Student：实例代码块执⾏");
    }

    static {
        System.out.println("Student：静态代码块执⾏");
    }
}