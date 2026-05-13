import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //求出0～n之间的所有“水仙花数”并输出
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int sum = 0;
            int count = 1;
            while(tmp / 10 != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;
            while(tmp != 0) {
                sum += Math.pow(tmp % 10,count);
                tmp /= 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
