import java.util.Arrays;

/**
 * Created by lsc on 2019/1/18.
 * 题目：从扑克牌中随机抽5张牌，判断是不是顺子，即这5张牌是不是连续的。
 * 2-10为数字本身，A为1，J为11,Q为12，K为13,而大小王可以看成任意的数字。
 */

/*
思路：我们需要把破壳拍的背景抽象成计算机语言。不难想象，我们可以把5张牌看成5个数字组成的数组
大小王是特殊的数字，我们不妨把他们都定义为0，这样就能和其他扑克牌区分开来了

接下来我们分析怎么判断5个数字是不是连续的，最直接的方法是把数组排序。值得注意的是
由于0可以当成任意数字，我们可以用0去补满数组中的孔雀。如果排序之后的数组不是连续的，即相邻
的两个数字相隔若干个数字，但只要我们有足够的0可以补满这两个数字的空缺，这个数组还是连续的。
举个例子，数组排序之后为{0,1,3,,4,5},在1和3之间空缺了一个2，刚好我们有一个0，也就是我们可以
把它当成2去填补这个空缺。

于是我们需要做3件事情:首先把数组排序，再统计数组中0的个数，最后统计排序之后相邻数字之间的空缺总数。
如果空缺的总数小于或者等于0的个数，那么这个数组就是连续的，反之就是不连续。

最后，我们还需要注意一点：如果数组中的非0数字重复出现，则该数组不是连续的。换成扑克牌的描述
方式就是如果一副牌里含有对子，则不可能是顺子。

 */



public class Problem44 {
    public static void main(String[] args) {
        int[] array={0,4,6,8,0};
        Problem44 test=new Problem44();
        System.out.println(test.isContinuous(array));
    }
    public boolean isContinuous(int[] number){
        if(number==null){
            return false;
        }
        Arrays.sort(number);
        int numberZero=0;
        int numberGap=0;
        for(int i=0;i<number.length&&number[i]==0;i++){
            numberZero++;
        }
        int small=numberZero;
        int big=small+1;
        while(big<number.length){
            if(number[small]==number[big])
                return false;
            numberGap+=number[big]-number[small]-1;
            small=big;
            big++;
        }
        return (numberGap>numberZero)?false:true;
    }
}