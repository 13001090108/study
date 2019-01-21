import java.util.Arrays;

/**
 * Created by lsc on 2018/12/4.
 * 题目：输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整
 数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n)。例
 如输入的数组为{1，-2,3,10，-4,7,2，-5}，和最大的子数组为{3,10，-4,7,2}。
 */

//动态规划方法
public class Problem31 {
    public static void main(String[] args) {
        Problem31 p = new Problem31();
        int[] array = {1 , -2 , 3 , 10 , -4 , 7, 2 , -5};
        System.out.println(p.findGreatestSubArray(array));

    }
    public int findGreatestSubArray(int[] array) {
        if(array == null) {
            return 0;
        }
        int[] f = new int[array.length];
        for(int i = 0 ; i < array.length ; i ++) {
            if(i == 0 || f[i - 1] <= 0) {
                f[i] = array[i];
            }else {
                f[i] = f[i - 1] + array[i];
            }
        }
        Arrays.sort(f);
        return f[array.length - 1];
    }
}

//
//分析规律方法
//public class Problem31 {
//    public static void main(String[] args) {
//        Problem31 p=new Problem31();
//        int[] array={1,-2,3,10,-4,7,2,-5};
//        System.out.println(p.findGreatestSubArray(array));
//    }
//    public int findGreatestSubArray(int[] array){
//        if(array==null)
//            return 0;
//        int currentSum=0;
//        int greatestSum=0;
//        for(int i=0;i<array.length;i++){
//            if(currentSum<=0){
//                currentSum=array[i];
//            }else{
//                currentSum+=array[i];
//            }
//            if(currentSum>greatestSum)
//                greatestSum=currentSum;
//        }
//        return greatestSum;
//    }
//}
