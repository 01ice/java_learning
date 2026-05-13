import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= input; i++) {
            int num = i;
            while (num > 0){
                if(num % 10 == 9){
                    count++;
                }
                num /= 10;
            }
        }
        System.out.println(count);
    }

    public static void main4(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            String numStr = String.valueOf(i);
            for (int j = 0; j < numStr.length(); j++) {
                if(numStr.charAt(j) == '9'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main3(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        /**
         * 1.先产生1~100的数字
         * 2.个位需不需要分情况讨论？(只有两种情况个位和十位),判断每一位%9==0，
         * 3.sum++,打印sum
         * 19,%10==9,%9,19/=10,%9
         * 先写再看能不能优化
         */
        int sum = 0;
        int units = 0;
        int tens = 0;
        for (int i = 1; i <= 100; i++) {
            units = i % 10;
            tens = i / 10;
            if(units % 9 == 0){
                sum++;
            }if(tens % 9 == 0){
                sum++;
            }
        }
        System.out.println(sum);

        String str = "Hello";
        System.out.println(str.length());  // 输出：5

        System.out.println(str.charAt(0));  // 输出：H
        System.out.println(str.charAt(1));  // 输出：e
        System.out.println(str.charAt(2));  // 输出：l
        System.out.println(str.charAt(3));  // 输出：l
        System.out.println(str.charAt(4));  // 输出：o
    }

    public static void main2(String[] args) {
        int a = 19;
        int sum = 0;
        String st1 = String.valueOf(a);
        switch(st1){
            case "9":
                sum++;
                break;
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        a += b;//a = a+b
        a -= b;
        a *= b;
        a /= b;
        a %= b;
        a++;
        ++a;
        a--;
        --a;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(10 > 20 && 10 / 0 == 0);
        System.out.println(10 < 20 || 10 / 0 == 0);
        int c = a>b?a:b;
        int d = 3;
        //byte e = d;
        System.out.println("\\\"hello\\\"");
    }
}
