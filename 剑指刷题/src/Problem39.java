/*
题目一：输入一棵二叉树的根结点，求该树的深度。从根结点到叶结点依次经过
        的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class Problem39 {
    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode();
        BinaryTreeNode node1=new BinaryTreeNode();
        BinaryTreeNode node2=new BinaryTreeNode();
        BinaryTreeNode node3=new BinaryTreeNode();
        BinaryTreeNode node4=new BinaryTreeNode();
        BinaryTreeNode node5=new BinaryTreeNode();
        BinaryTreeNode node6=new BinaryTreeNode();
        root.leftNode=node1;
        root.rightNode=node2;
        node1.leftNode=node3;
        node1.rightNode=node4;
        node2.rightNode=node5;
        node4.leftNode=node6;
        root.value=1;
        node1.value=2;
        node2.value=3;
        node3.value=4;
        node4.value=5;
        node5.value=6;
        node6.value=7;
        Problem39 p=new Problem39();
        System.out.println(p.treeDepth(root));
    }
    public int treeDepth(BinaryTreeNode root){
        if(root==null)
            return 0;
        int left=treeDepth(root.leftNode);
        int right=treeDepth(root.rightNode);
        return (left>right)?left+1:right+1;
    }
}
