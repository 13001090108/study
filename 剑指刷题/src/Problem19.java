import java.util.Stack;

/**
 * Created by lsc on 2018/11/20.
 * 题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */


public class Problem19 {
    public static void main(String[] args) {
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
        Problem19 test=new Problem19();
        BinaryTreeNode root = root1;
        BinaryTreeNode rootBinaryTreeNode=test.mirrorBinaryTree(root1);
        System.out.println(rootBinaryTreeNode.value);
        System.out.println(rootBinaryTreeNode.leftNode.value);
        System.out.println(rootBinaryTreeNode.rightNode.value);
        System.out.println(rootBinaryTreeNode.rightNode.leftNode.value);
        System.out.println(rootBinaryTreeNode.rightNode.rightNode.value);
        System.out.println(rootBinaryTreeNode.rightNode.leftNode.leftNode.value);
        System.out.println(rootBinaryTreeNode.rightNode.leftNode.rightNode.value);

    }

/*   递归用法
    public BinaryTreeNode mirrorBinaryTree(BinaryTreeNode root)
    {
        if(root==null)
            return null;
        //交换该节点指向的左右节点。
        BinaryTreeNode temp = root.leftNode;
        root.leftNode=root.rightNode;
        root.rightNode=temp;
        //对其左右孩子进行镜像处理。
        mirrorBinaryTree(root.leftNode);

        mirrorBinaryTree(root.rightNode);
        return root;
    }
*/

/*
非递归
 */

public BinaryTreeNode mirrorBinaryTree(BinaryTreeNode root) {
    if(root == null) {
        return null;
    }
    if(root.leftNode == null && root.rightNode == null) {
        return root;
    }
    Stack<BinaryTreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()) {
        BinaryTreeNode treeNode = stack.pop();
        Swap(treeNode);
        if(treeNode.leftNode != null) {
            stack.push(treeNode.leftNode);
        }
        if(treeNode.rightNode != null) {
            stack.push(treeNode.rightNode);
        }


    }
    return root;
}

public void Swap(BinaryTreeNode root) {
    BinaryTreeNode temp = root.rightNode;
    root.rightNode = root.leftNode;
    root.leftNode = temp;
}
}