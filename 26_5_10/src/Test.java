public class Test {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }

    public static void main7(String[] args) {
        int a = 10;
        String s1 = a + "";
        String s2 = String.valueOf(a);
        String s3 = "10";
        int num = Integer.parseInt(s3);
    }

    public static void main6(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1+s2);
    }

    public static void main5(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        System.out.println(c);
    }

    public static void main4(String[] args) {
        int a = 10;
        long b = 20L;
        //a = a+b;//报错,int提升为long，最后a+b的类型是long,不能赋给int
        a += b;
        System.out.println(a);
    }

    public static void main3(String[] args) {
        int a = 100;
        long b = 10L;
        a = (int)b;//强制类型转换会丢失数据

        byte b1 = 100;//100默认为int，没有超过byte的范围，隐式转换
        byte b2 = (byte)257;//257默认为int，超过了范围,需要强转
    }

    public static void main2(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a/b);
        double c = 1.0;
        double d = 2.0;
        System.out.println(c/d);
        System.out.println(a/d);
    }


    public static void main1(String[] args) {
        char c1 = '我';
        //System.out.println(c1);
        byte a = 10;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        short b = 20;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        int c = 100;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long d = 10L;//为了区分int和long，long一般加一个大写L
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        float e = 1.1f;//默认是double类型，为了区分就加一个f,F也行
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

    }
}
