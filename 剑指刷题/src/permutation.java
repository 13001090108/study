import java.util.Arrays;

/**
 * Created by lsc on 2019/1/5.
 */

public class permutation {
    //s表示，从array[start]后的数据进行全排列
    public static int permute(int[] array, int start) {
        int max = 0;
        if (start == array.length) {  // 输出
            int sum = 0;
            int c = 1;
            for(int i = array.length - 1 ; i >= 0 ; i --) {
                sum += c * array[i];
                c *= 10;
            }
            if(max < sum) {
                max = sum;
            }
            System.out.println(Arrays.toString(array) + max);
        } else
            for (int i = start; i < array.length; ++i) {
                swap(array, start, i);  //  交换元素
                permute(array, start + 1);  //交换后，再进行全排列算法
                swap(array, start, i);  //还原成原来的数组，便于下一次的全排列
            }

            return max;
    }

    private static void swap(int[] array, int s, int i) {
        int t = array[s];
        array[s] = array[i];
        array[i] = t;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        permute(array, 0);
        System.out.println(permute(array,0));
    }

}