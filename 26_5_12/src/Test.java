import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 9) {
                    count++;
                }
                num /= 10;
            }
        }
        System.out.println(count);
    }

    public static void main19(String[] args) {
        //输出一个整数的每一位，如：123的每一位是3，2，1
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input % 10);
        System.out.println((input /10) % 10);
        System.out.println(input / 100);
    }

    public static void main18(String[] args) {
        int sum = 0;
        int a = 0;//个位
        int b = 0;//十位
        int c = 0;//百位
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            a = i % 10;
            temp /= 10;
            b = temp % 10;
            temp /= 10;
            c = temp % 10;
            sum = a*a*a+b*b*b+c*c*c;
            if(i == sum) {
                System.out.println(i);
            }
        }
    }

    public static void main17(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                sum += 1.0 / i;
            }else {
                sum -= 1.0 / i;
            }
        }
        System.out.println(sum);//0.688172179310195
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main16(String[] args) {
        int a = 40;
        int b = 20;
        System.out.println(gcd(a,b));
    }

    public static void main15(String[] args) {
        int gcd = 1;
        int a = 40;
        int b = 20;
        for (int i = Math.min(a,b); i >= 1; i--) {
            if((a % i == 0)&&(b % i == 0)) {
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }

    public static void main14(String[] args) {
        int a = 40;
        int b = 20;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }

    public static void main13(String[] args) {
        //打印9*9乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %-4d ",j,i,i*j);
            }
            System.out.println();
        }
    }

    public static void main12(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                //循环体
                a++;
            }
            b++;
        }
        System.out.println(a);
        System.out.println(b);
        /*int a = 0;
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                //循环体
                a++;
            }
            b++;
        }
        System.out.println(a);
        System.out.println(b);*/
    }

    public static void main11(String[] args) {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                //循环体
                a++;
            }
        }
        System.out.println(a);
    }

    public static void main10(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int fac = 1;
            for (int j = 1; j <= i; j++) {
                fac *= j;
            }
            sum += fac;
        }
        System.out.println(sum);
    }

    public static void main9(String[] args) {
        /*for(表达式1; 布尔表达式2; 表达式3) {
            //表达式4
        }*/
        int fac = 1;
        for (int i = 1; i <= 5; i++) {
            fac *= i;
        }
        System.out.println(fac);
    }

    public static void main8(String[] args) {
        /*while (循环条件) {
            //循环语句
        }*/
        int sum = 0;
        int fac = 1;
        int i = 1;
        int j = 1;
        while(i <= 5) {
            while (j <= i){
                fac *= j;
                j++;
                sum += fac;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static void main7(String[] args) {
        int day = 2;
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    public static void main6(String[] args) {
        /*switch(表达式){
            case 常量值1:
                //语句1;
                break;
            case 常量值2:
                //语句2;
                break;
            default:
                //都不满足执行
                //语句3；
                break;
        }*/
    }

    public static void main5(String[] args) {
        int x = 10;
        int y = 10;
        if (x == 10)
            if (y == 10)
                System.out.println("aaa");
            else
                System.out.println("bbb");
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }
    }

    public static void main3(String[] args) {
        int num = 9;
        if(num > 0) {
            System.out.println("正数");
        }else if(num < 0){
            System.out.println("负数");
        }else {
            System.out.println(0);
        }
    }

    public static void main2(String[] args) {
        int num = 10;
        if(num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    public static void main1(String[] args) {
        System.out.println(1);//1
        System.out.println(2);//2
        System.out.println(3);//3
        /*if(布尔表达式1) {
            //语句1
        }else if(布尔表达式2){
            //语句2
        }else {
            //语句3
        }*/
        while(true){
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if(i > 10) {
                System.out.println(">10");
            }else {
                System.out.println("<=10");
            }
        }

    }
}
