/*
题目一：输入一个递增排序的数组和一个数字s，在数组中查找两个数使得他们
的和正好是s。如果有多对数字的和等于s，输出任意一对即可。例如：输入数组
{1,2,4,7,11,15}和数字为15,输出4和11
 */


/*
题目二：输入一个正数 s，打印出所有和为 s 的连续正数序列（至少含两个数）。
        例如输入 15，由于 1+2+3+4+5=4+5+6=7+8=15，所以结果打印出 3 个连续序列 1-5、
        4-6、和 7-8.
 */

public class Problem41 {
    public static void main(String[] args) {
        Problem41 p = new Problem41();
        int[] data = {1, 2, 4, 7, 11, 15};
        int sum = 15;
        p.findContinuesSequence(sum);

    }

    public int[] findNumberWithSum(int[] data, int sum) {
        int[] ans = new int[2];
        if (data == null) {
            return ans;
        }
        int start = 0;
        int end = data.length - 1;

        while (start < end) {
            int current = data[start] + data[end];
            if (current == sum) {
                ans[0] = start;
                ans[1] = end;
                break;
            } else if (current < sum) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }


    public void findContinuesSequence(int sum) {
        if(sum < 3)
            return;
        int small = 1;
        int big = 2;
        int middle = (1 + sum) / 2;
        int curSum = small + big;
        while(small < middle) {
            if(curSum == sum) {
                printContineNum(small,big);
            }
            while(curSum > sum && small < middle) {
                curSum -= small;
                small ++;
                if(curSum == sum) {
                    printContineNum(small,big);
                }
            }
            big ++;
            curSum += big;
        }
    }

    private void printContineNum(int small , int big) {
        for(int i = small ; i <= big ; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



}



