import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 3;  // 3个盘子
        System.out.println("汉诺塔移动步骤（" + n + "个盘子）：");
        Hanoi.hanoi(n, 'A', 'C', 'B');
        System.out.println("总共移动次数：" + (int)(Math.pow(2, n) - 1));
    }

    public class Hanoi {

        /**
         * 汉诺塔递归函数
         * @param n 盘子数量
         * @param from 起始柱子
         * @param to 目标柱子
         * @param helper 辅助柱子
         */
        public static void hanoi(int n, char from, char to, char helper) {
            // 递归出口：只有一个盘子时直接移动
            if (n == 1) {
                System.out.println("移动盘子 1 从 " + from + " 到 " + to);
                return;
            }

            // 1. 把上面n-1个盘子从from移到helper（借助to）
            hanoi(n - 1, from, helper, to);

            // 2. 把最大的盘子从from移到to
            System.out.println("移动盘子 " + n + " 从 " + from + " 到 " + to);

            // 3. 把n-1个盘子从helper移到to（借助from）
            hanoi(n - 1, helper, to, from);
        }

}

    public static int findOnceNum(int[] arr) {
        int flag = arr[0];
        for (int i = 1; i < arr.length; i++) {
            flag ^= arr[i];
        }
        return flag;
    }

    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
//奇数位于偶数之前
    public static int[] adjust(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] %2 != 0) {
                        int tmp = 0;
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }
//nums = [2,7,11,15], target = 9
    //只能输出一对
    public static int[] findTarget(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return new int[]{-1};
    }
    //ArrayList方法
    public static int[] findTarget1(int[] nums,int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        if(list.isEmpty()) {
            return new int[]{-1};
        }
        // 将 ArrayList 转换为 int[]
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }


    public static void main1(String[] args) {
        int[] arr1 = {2,4,4,8,1};
        int[] nums = {2,7,0,9,15};
        System.out.println(Arrays.toString(findTarget1(nums,9)));
        //System.out.println(findOnceNum(arr1));
        //System.out.println(Arrays.toString(transform(arr1)));
        //System.out.println(Arrays.toString(adjust(arr1)));
    }
}
