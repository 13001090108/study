/**
 * Created by lsc on 2018/11/20.
 * 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 分析详细博客
 * https://blog.csdn.net/yiyiwudian/article/details/46707875
 */
public class Problem20 {
    public static void main(String[] args) {
//        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Problem20 testCircle=new Problem20();
        testCircle.printMatixClockwisely(array);
    }
    public void printMatixClockwisely(int[][] array){
        if(array==null)return;
        int start=0;
        while(array[0].length>start*2&&array.length>start*2){
            printOneCircle(array,start);
            start++;
        }
    }
    private void printOneCircle(int[][] array, int start) {
        //将第一行的整行进行输出
        for(int i=start;i<array[0].length-start;i++){
            System.out.print(array[start][i]+" ");
        }
        System.out.println();
        //若最后一行行号大于起始行号，则能进行从上到下的打印输出(打印从起始行的下一行开始到倒数第二行)
        if(array.length-1-start>start){
            for(int i=start+1;i<array.length-start-1;i++){
                System.out.print(array[i][array[0].length-1-start]+" ");
            }
        }
        System.out.println();
        //若最大列大于起始列且最大行大于起始行，则能进行从右向左打印输出(打印从最大列到最初列+1）
        if(array[0].length-start-1>start && array.length-start-1>start)
        {
            for(int i=array[0].length-start-1;i>start;i--)
            {
                System.out.print(array[array.length-start-1][i]+" ");
            }
        }
        System.out.println();
        //若最大行大于最初行且最大列大于最初列，则能进行从下到上打印输出(打印从最大行到最初行+1)
        if(array.length-1-start>start && array[0].length-1-start>start)
        {
            for(int i=array.length-start-1;i>start;i--)
            {
                System.out.print(array[i][start]+" ");
            }
        }
        System.out.println();
    }
}

