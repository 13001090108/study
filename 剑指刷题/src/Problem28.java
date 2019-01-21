/**
 * Created by lsc on 2018/12/1.
 * 题目：输入一个字符串，打印出该字符串中字符的所有排列。
 */

/*

思路：采用递归的思想：

把需要全排列的字符串分成两部分看待：

(1)字符串的第一个字符

(2)第一个字符后面的所有字符

求所有可能出现在第一个位置的字符；将第一个字符和后面的字符一次交换

固定一个字符，对第一个字符后面的所有字符全排列。第一个字符后面的所有字符又可以分为两部分；
 */

public class Problem28 {
    public static void main(String[] args) {
        char[] buf = {'a', 'b' , 'c' , 'd'};
        perm(buf , 0 ,buf.length - 1);

    }
    public static void perm(char[]buf , int start , int end) {
        if(start == end) {
            for(int i = 0 ; i <= end ; i ++) {
                System.out.print(buf[i]);
            }
            System.out.println();
        }else {
            for(int i = start ; i <= end ; i ++) {
                char temp = buf[start];
                buf[start] = buf[i];
                buf[i] = temp;
                perm(buf , start + 1 , end);
                temp = buf[start];
                buf[start] = buf[i];
                buf[i] = temp;
            }
        }
    }
}


//    public static void main(String args[])
//    {
//        Problem28 testPermutation=new Problem28();
//        testPermutation.permutation("abcd");
//    }
//    public void permutation(String str){
//        int count=0;
//        if(str==null)
//            return;
//        char[] chs=str.toCharArray();
//        int point=0;
//        System.out.print(chs);
//        System.out.print(" ");
//        count++;
//        char temp1=chs[point];chs[point]=chs[++point];
//        chs[point]=temp1;
//        while(!String.valueOf(chs).equals(str)){
//            System.out.print(chs);
//            System.out.print(" ");
//            count++;
//            if(point==chs.length-1){
//                char temp=chs[point];
//                chs[point]=chs[0];
//                chs[0]=temp;
//                point=0;
//            }else{
//                char temp=chs[point];
//                chs[point]=chs[++point];
//                chs[point]=temp;
//            }
//        }
//        System.out.println(count);
//    }
//}