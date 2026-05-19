import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

    public static class Data {

        private int x;
        private int y;

        public Data(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

    public static boolean threeOddNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                count++;
                return true;
            }else {
                count = 0;
            }
        }
        return false;
    }

    public static void main2(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeOddNumber(arr));
    }

    public static void main1(String[] args) {
        int[] arr = new int[] {2,2,1,1,1,2,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}

