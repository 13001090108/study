/**
 * Created by lsc on 2018/12/6.
 * 题目：我们把只包含因子 2,3,和 5 的称为丑数。求按从小到大的顺序的第 1500
 个丑数。例如 6、8 都是丑数，但 14 不是，因为它包含因子 7.习惯上我们把 1
 当做第一个丑数。
 */

/*
思路： 我们要试着找到一种只要计算抽数的方法，而不再非丑数的整数上花费时间。根据丑数的定义，丑数应该是另一个丑数
乘以2,3，或者5的结果（1除外).因此我们可以创建一个数组，里面的数字是排好序的丑数。每一个丑数都是前面丑数乘以2,3，
或者5得到的。

这种思路的关键在于怎样确保数组里面的丑数是拍好序的。假设数组中已经有若干个丑数排好序后存放在数组中，并且把已有最大
的丑数记做M,我们接下来分析如何生成下一个丑数。该丑数肯定是前面某一个丑数乘以2,3或者5的结果，所以我们首先考虑把已有
的每个丑数乘以2.在乘以2的时候，能得到若干个小鱼或等于M的结果。由于是按照顺序生成的，小于或者等于M的肯定已经在数组中
了，我们不需要再次考虑；还会得到若干个大于M的结果，但我们只需要第一个大于M的结果，因为我们希望丑数是按照从小到大的
顺序生成的，其他更大的结果以后再说。我们把得到的第一个乘以2后大于M的结果即为M2,同样，我们吧已有的每一个丑数乘以3和5
能得到第一个大于M的结果M3和M5,那么下一个丑数应该是M2，M3,M5这三个数的最小者。

前面分析的时候，提到把已有的每个丑数分别乘以2,3,和5.事实上这不是必须的，因为已有的丑数是按照顺序存放在数组中的。
对于乘以2而言，肯定存在某一个丑数T2,排在它之前的每一个丑数乘以2得到的结果都会小于已有最大的丑数，在他之后的每一个
丑数乘以2得到的结果都会小于已有最大的丑数，在它之后的每一个丑数乘以2得到的结果都会太大。我们只需记下这个丑数的位置
同时每次生成新的丑数的时候，去更新这个T2,对乘以3和5而言，也存在着同样的T3和T5.
 */



public class Problem34 {
    public static void main(String[] args) {
        Problem34 p=new Problem34();
        System.out.println(p.getUglyNumber(1500));}
    public int getUglyNumber(int n){
        if(n<0)
            return 0;
        int[] uglyArray=new int[n];
        uglyArray[0]=1;
        int multiply2=1;
        int multiply3=1;
        int multiply5=1;
        for(int i=1;i<uglyArray.length;i++){
            int min=min(multiply2*2,multiply3*3,multiply5*5);
            uglyArray[i]=min;
            while(multiply2*2<=min)
                multiply2++;
            while(multiply3*3<=min)
                multiply3++;
            while(multiply5*5<=min)
                multiply5++;
        }
        return uglyArray[n-1];
    }
    private int min(int i, int j, int k) {
        int min=(i<j)?i:j;
        return (min<k)?min:k;
    }
}
