public class Test {

    public static int sum(int n) {
        int sum = 0;
        if(n < 10) {
            return n;
        }else {
            return n/10 + sum(n /= 10);
        }
    }

    public static void main(String[] args) {

    }
}
