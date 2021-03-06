import java.util.Stack;

/**
 * Created by lsc on 2018/11/23.
 * 题目：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是
 否为该栈的弹出序列。假设压入栈的所有数字均不相等。例如压栈序列为 1、2、
 3、4、5.序列 4、5、3、2、1 是压栈序列对应的一个弹出序列，但 4、3、5、1、
 2 却不是。
 */

/*
思路：首先借助一个辅助栈，把输入的第一个序列中的数字依次压入该辅助栈，并按照第二个序列的顺序依次从该栈中弹出数字。
从上面的两个例子可以找到判断一个序列是不是栈的弹出序列的规律：
如果下一个弹出的数字刚好是栈顶数字，那么直接弹出。如果下一个弹出的数字不在栈顶，
我们把压栈序列中还没有入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
如果所有的数字都压入栈了仍然没有找到下一个弹出的数字，那么该序列就不可能是一个弹出序列。

 */

public class Problem22 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={4,3,5,2,1};
        Problem22 test=new Problem22();
        System.out.println(test.isPopOrder(array1, array2));

        String s = "S";
        String[] string = s.split(":");
        for(String s1 : string) {
            System.out.println(s1);
        }

    }
    public boolean isPopOrder(int[] line1,int[] line2){
        if(line1==null||line2==null){
            return false;
        }
        int point1=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<line2.length;i++){
            if(!stack.isEmpty()&&stack.peek()==line2[i]){
                stack.pop();
            }else{
                if(point1==line1.length){
                    return false;
                }else{
                    do{
                        stack.push(line1[point1++]);
                    }while(stack.peek()!=line2[i]&&point1!=line1.length);
                    if(stack.peek()==line2[i])
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return true;
    }
}