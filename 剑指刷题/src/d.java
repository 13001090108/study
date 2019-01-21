import java.util.Arrays;

/**
 * Created by lsc on 2019/1/3.
 */
public class d {
    public static void main(String[] args) {

    }
}

class Solution {
    public static void permute(int[] array, int start) {
        int max = 0;

        if (start == array.length) {  // 输出
            int c = 1;
            int num = 0;
            System.out.println(Arrays.toString(array));
            for(int i = array.length - 1 ; i >= 0  ; i --) {
                num += c * i;
                c *= 10;
            }
            if(num > max && num < 2359) {
                max = num;
                System.out.println(max);
            }

        } else
            for (int i = start; i < array.length; ++i) {
                swap(array, start, i);  //  交换元素
                permute(array, start + 1);  //交换后，再进行全排列算法
                swap(array, start, i);  //还原成原来的数组，便于下一次的全排列
            }
    }

    private static void swap(int[] array, int s, int i) {
        int t = array[s];
        array[s] = array[i];
        array[i] = t;
    }

    public String largestTimeFromDigits(int[] A) {
        String ans = "";


        return ans;
    }
}
