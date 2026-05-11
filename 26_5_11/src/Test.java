public class Test {
    public static void main(String[] args) {
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
    }
}
