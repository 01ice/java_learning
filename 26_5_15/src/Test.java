public class Test {

    public static void main(String[] args) {
        int []arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] array = {1, 2, 3};
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

    public static void printNum(int n) {
        if(n < 10) {
            System.out.print(n+" ");
        }else {
            printNum(n / 10);
            System.out.print(n % 10+" ");
        }
    }

    public static int facAdd(int n) {
        if(n == 1) {
            return 1;
        }
        return n + facAdd(n - 1);
    }

    public static int sum(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 +sum(n / 10);
    }

    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main1(String[] args) {
        //System.out.println(fac(3));
        //printNum(1234);
        System.out.println(facAdd(4));
        System.out.println(sum(1729));
        int[]array = new int[]{10, 20, 30, 40, 50};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        //也可以通过[]对数组中的元素进⾏修改
        array[0] = 100;
        System.out.println(array[0]);
    }
}
