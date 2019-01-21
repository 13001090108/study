import java.util.Arrays;

/**
 * Created by lsc on 2018/11/28.
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 是则返回true，否则返回false。
 */

public class Problem24 {
    public static void main(String[] args) {
        int[] array = {5, 7, 6, 9, 11, 10, 8};
//        int[] array = {7, 4, 6, 5};
//        int[] array = {6, 7, 8, 5};
        Problem24 p24 = new Problem24();
        System.out.println(p24.verfiySequenceOfBST(array));
    }




    public boolean verfiySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        int length = sequence.length;
        int root = sequence[length - 1];
        int cut = 0;
        for (int i = 0; i < length - 1; i++) {
            if (sequence[i] > root)
                cut = i + 1;
            break;
        }
        if (cut == 0) {
            verfiySequenceOfBST(Arrays.copyOfRange(sequence, 0,
                    length - 1));
        } else {
            for (int j = cut; j < length - 1; j++) {
                if (sequence[j] < root)
                    return false;
            }
        }
        boolean left = true;
        if (cut > 0)
            left = verfiySequenceOfBST(Arrays.copyOfRange(sequence,
                    0, cut));
        boolean right = true;
        if (cut < length - 1)
            right =
                    verfiySequenceOfBST(Arrays.copyOfRange(sequence, cut, length - 1));
        return (right && left);
    }


    //自己写的，好理解
//    public boolean verfiySequenceOfBST(int[] sequence) {
//
//        if (sequence.length == 0) {
//            return true;
//        }
//        int[] sequenceOfSort = Arrays.copyOfRange(sequence, 0, sequence.length);
//        Arrays.sort(sequenceOfSort);
//        int index = 0;
//        for (int i = 0; i < sequence.length; i++) {
//            if (sequence[sequence.length - 1] == sequenceOfSort[i]) {
//                index = i;
//                break;
//            }
//        }
//
//        int[] num1 = Arrays.copyOfRange(sequenceOfSort, 0, index);
//        int[] num2 = Arrays.copyOfRange(sequence, 0, index);
//
//        if (!isSame(num1 , num2)) {
//            return false;
//        }
//
//        int[] num3 = Arrays.copyOfRange(sequenceOfSort, index + 1, sequenceOfSort.length);
//        int[] num4 = Arrays.copyOfRange(sequence, sequence.length - index - 1, sequence.length - 1);
//
//        if (!isSame(num3 , num4)){
//            return false;
//        }
//
//
//
//        return verfiySequenceOfBST(num2) &&
//                verfiySequenceOfBST(num4);
//    }
//
//
//    public boolean isSame(int[] nums1, int[] nums2) {
//        if (nums1.length != nums2.length) return false;
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0 ; i < nums2.length ; i ++) {
//            list.add(nums2[i]);
//        }
//        for(int i = 0 ; i < nums1.length ; i ++) {
//            if(! list.contains(nums1[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
}