import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by lsc on 2018/12/3.
 * 题目：输入 n 个整数，找出其中最小的 k 个数。例如输入 4,5,1，6,2,7,3,8 这
 8 个数字，则最少的 4 个数字是 1,2,3,4.
 */


public class Problem30 {
    public static void main(String[] args) {
        Problem30 test=new Problem30();
        int[] array={4,5,1,6,2,7,3,8};
        test.getLeastNumbers(array,2);
    }
    public static ArrayList<Integer> getLeastNumbers(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(input == null || k <= 0 || k > input.length) {
            return result;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {

            //因为要满足大根堆需求，所以使用自定义比较器，比较策略为o1大于o2时，o1放o2的前面
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i < input.length; i++) {
            if(i < k) {
                priorityQueue.add(input[i]);
            } else if(input[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        result.addAll(priorityQueue);

        System.out.println(result);

        return result;
    }
}




//public class Problem30 {
//    public static void main(String[] args) {
//        Problem30 test=new Problem30();
//        int[] array={4,5,1,6,2,7,3,8};
//        test.getLeastNumbers(array,2);
//    }
//    public void getLeastNumbers(int[] array,int k){
//        if(array==null||k<0||k>array.length)
//            return;
//        int[] kArray= Arrays.copyOfRange(array, 0, k);
//        buildMaxHeap(kArray);
//        for(int i=k;i<array.length;i++){
//            if(array[i]<kArray[0]){
//                kArray[0]=array[i];
//                maxHeap(kArray,0);
//            }
//        }
//        for(int i:kArray)
//            System.out.print(i);
//    }
//    private void maxHeap(int[] kArray, int i) {
//        int left=2*i;
//        int right=left+1;
//        int largest=0;
//        if(right<kArray.length&&kArray[left]>kArray[i])
//            largest=left;
//        else
//            largest=i;
//        if(right<kArray.length&&kArray[right]>kArray[largest])
//            largest=right;
//        if(largest!=i){
//            int temp=kArray[i];
//            kArray[i]=kArray[largest];
//            kArray[largest]=temp;
//            maxHeap(kArray, largest);
//        }
//    }
//    private void buildMaxHeap(int[] kArray) {
//        for(int i=kArray.length/2;i>=0;i--)
//            maxHeap(kArray, i);
//    }
//}
