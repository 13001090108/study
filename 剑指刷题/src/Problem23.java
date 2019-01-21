import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lsc on 2018/11/28.
 * 题目：从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
 */

public class Problem23 {
    public static void main(String args[])
    {
        BinaryTreeNode root1=new BinaryTreeNode();
        BinaryTreeNode node1=new BinaryTreeNode();
        BinaryTreeNode node2=new BinaryTreeNode();
        BinaryTreeNode node3=new BinaryTreeNode();
        BinaryTreeNode node4=new BinaryTreeNode();
        BinaryTreeNode node5=new BinaryTreeNode();
        BinaryTreeNode node6=new BinaryTreeNode();
        root1.leftNode=node1;
        root1.rightNode=node2;
        node1.leftNode=node3;
        node1.rightNode=node4;
        node4.leftNode=node5;
        node4.rightNode=node6;
        root1.value=8;
        node1.value=8;
        node2.value=7;
        node3.value=9;
        node4.value=2;
        node5.value=4;
        node6.value=7;
        Problem23 test=new Problem23();
        test.printFromTopToBottom(root1);
    }

    public void printFromTopToBottom(BinaryTreeNode root){
        if(root==null)
            return;
        Queue<BinaryTreeNode> queue=new
                LinkedList<BinaryTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode node=queue.poll();
            System.out.print(node.value);
            if(node.leftNode!=null){
                queue.add(node.leftNode);
            }
            if(node.rightNode!=null){
                queue.add(node.rightNode);
            }
        }
    }
}
