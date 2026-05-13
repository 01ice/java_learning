import java.util.Random;
import java.util.Scanner;

public class Test {
    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？

    public static int findMax(int a, int b) {
        if(a >= b) {
            return a;
        }
        return b;
    }

    public static double findMax(double a, double b, double c) {
        double max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    public static void main(String[] args) {
        int ret1 = findMax(10,20);
        double ret2 = findMax(20.3,10.5,33.3);
        System.out.println(ret1);
        System.out.println(ret2);
    }

    public static int facSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += fac(i);
        }
        return sum;
    }

    public static int fac(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int fibonacciSequence(int n) {
        if(n == 1) {
            return 0;
        }else if(n == 2) {
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ret = fibonacciSequence(n);
            System.out.println(ret);
        }
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if((x == y)||(x + y == n-1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    public static void swap(int x,int y) {
        int tmp = 0;
        tmp = x;
        x = y;
        y = tmp;
    }

    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("交换前a = "+a+" b = "+b);
        swap(a,b);
        System.out.println("交换后a = "+a+" b = "+b);
    }

    public static boolean estimateLeapYear(int y) {
        if(((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))) {
            return true;
        }
        return false;
    }

    public static void main5(String[] args) {
        int ret = facSum(5);
        System.out.println(ret);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String passWord = sc.nextLine();
            if(passWord.equals("12345")) {
                System.out.println("输入正确");
                return;
            }else {
                count--;
                System.out.println("输入错误，还有"+count+"次机会");
            }
        }
    }

    public static void main3(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);//生成1~100的随机数
        System.out.println(toGuess);
        System.out.println("请输入数字（1~100）");
        while (true) {
            int num = sc.nextInt();
            if(num < toGuess) {
                System.out.println("猜小了");
            }else if(num > toGuess) {
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        /*System.out.println("abc");
        System.out.print("abc");
        System.out.printf("%s","abc");*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("请输入你的工资");
        double salary = sc.nextDouble();
        System.out.println("姓名"+name+"年龄"+age+"工资"+salary);

        sc.close();
    }
}
