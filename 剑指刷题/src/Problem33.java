/**
 * Created by lsc on 2018/12/6.
 *
 * 题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼
 接出的所有数字的最小的一个。例如输入{3,32,321}，则打印最小的数字是
 321323.
 *
 */

/*

思路：1、主要的思路是利用递归去判断两个数字m和n，合并后是mn大还是nm大。
 2、在这里需要注意如果2个由int类型表示的数字，在合并后很可能会超出int类型能表示的范围，所以这里还是一个隐形的大数问题。
 3、对于大数问题最好的解决办法是利用字符串来解决，并且mn和nm这2个数字的位数都是一样的，更可以用字符串来解决。
 总结：于是问题就变成递归的每次比较2个数字是合并前大还是合并后大，然后再输出最终合并的数字，该数字就是最小的数字

 */



public class Problem33 {
    public static void main(String[] args) {
        Problem33 test=new Problem33();
        int[] array={3,32,321};
        test.printMin(array);
    }
    public void printMin(int[] array){
        int[] clone=array.clone();
        printMinNumber(clone,0,clone.length-1);
        for(int i:clone)
            System.out.print(i);
    }
    private void printMinNumber(int[] array, int start, int end) {
        if(start<end){
            int main_number=array[end];
            int small_cur=start;
            for(int j=start;j<end;j++){
                if(isSmall(String.valueOf(array[j]),String.valueOf(main_number))){
                    int temp=array[j];
                    array[j]=array[small_cur];
                    array[small_cur]=temp;
                    small_cur++;
                }
            }
            array[end]=array[small_cur];
            array[small_cur]=main_number;
            printMinNumber(array, 0, small_cur-1);
            printMinNumber(array, small_cur+1, end);
        }
    }
    private boolean isSmall(String m, String n) {
        String left=m+n;
        String right=n+m;
        boolean result=false;
        for(int i=0;i<left.length();i++)
        {
            if(left.charAt(i)<right.charAt(i))
                return true;
            else
            if(left.charAt(i)>right.charAt(i))
                return false;
        }
        return result;
    }
}
