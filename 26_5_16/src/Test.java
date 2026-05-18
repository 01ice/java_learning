
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println("");
        }
    }

    public static void main3(String[] args) {
        int[] arr = {9, 5, 2, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main2(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        //System.out.println(binarySearch(arr1, 6));
        System.out.println(Arrays.toString(bubbleSort(arr2)));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;  // 标志：本轮是否发生交换

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;   // 发生了交换
                }
            }

            // 如果本轮没有交换，说明已经有序，提前结束
            if (!flag) {
                break;
            }
        }
        return arr;
    }
}



   /* public static int find(int[] arr,int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return i;
            }
        }
        return -1;
    }*/

    /*public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = arr;
        newArr[0] = 10;
        System.out.println("arr"+Arrays.toString(arr));//arr[10, 2, 3, 4, 5]
        //使⽤Arrays中copyOf⽅法完成数组的拷⻉：
        // copyOf⽅法在进⾏数组拷⻉时，创建了⼀个新的数组
        // arr和newArr引⽤的不是同⼀个数组
        arr[0] = 1;
        newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("newArr"+Arrays.toString(newArr));
        arr[0] = 10;
        System.out.println("newArr"+Arrays.toString(newArr));
        //拷贝某个范围
        int[] arr2 = Arrays.copyOfRange(arr,2,4);
        System.out.println("arr2"+Arrays.toString(arr2));//arr2[3, 4]


        //String newArr = Arrays.toString(arr);
        //System.out.println(newArr);
    }
}*/
