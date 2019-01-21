/*
题目：一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序
        找出这两个只出现一次的数字。要求时间复杂度是 O（n），空间复杂度为 O（1）；

 */

/*
思路： 这是一个比较难的问题，我们想要异或运算的一个性质：任何一个数字异或它自己都等于0.
也就是说，如果数组中只有一个出现一次的数字，如果我们从头到尾依次异或数组中的每一个数字，那么最终
的结果刚好是那个只出现一次的数字，因为那些成对出现的两次的数字全部在异或中抵消了。

我们试着把原数组分成两个子数组，使得每个子数组包含一个只出现一次的数字，而其他数字都成对出现两次。
如果能够这样拆分成两个数组，我们就可以按照前面的方法分别找出两个只出现一次的数字了

我们还是从头到尾一次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果。
因为其他数字都出现了两次，在异或中全部抵消了。由于这两个数字肯定不一样，那么异或的结果肯定不为0，也就是
说在这个结果数字的二进制表示中至少就有一位1.我们在结果数字中找到第一个为1的位的位置，即为第n位。现在我们以第n位
是不是1为标准把原数组中的数字分成两个子数组，第一个子数组中的每个数字的第n位都是1，而第二个子数组中的每个数字的
第n位都是0.由于我们分组的标准是数字中的某一位是1还是0，那么出现了两次的数字肯定被分配到同一个子数组。
 */


public class Problem40 {
    public static void main(String[] args) {
        int[] array = {2 , 4, 3, 6, 3, 2, 5, 5};
        Problem40 p = new Problem40();
        p.findNumsAppearOne(array);
    }
    public void findNumsAppearOne(int[] array) {
        if(array == null)
            return;
        int number = 0;
        for(int i : array)
            number ^= i;
        int index = findFirstBitIs1(number);
        int number1 = 0;
        int number2 = 0;
        for(int i : array) {
            if(isBit1(i,index)) {
                number1 ^= i;
            }
            else {
                number2 ^= i;
            }
        }
        System.out.println(number1);
        System.out.println(number2);
    }

    private  int findFirstBitIs1(int number) {
        int indexBit = 0;
        while ((number & 1) == 0) {
            number = number >> 1;
            ++ indexBit;
        }
        return indexBit;
    }

    private boolean isBit1(int number , int index) {
        number = number >> index;
        return (number & 1) == 1;
    }

}
