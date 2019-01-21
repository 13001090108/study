/**
 * Created by lsc on 2018/11/30.
 * 题目：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求
 不能创建任何新的结点，只能调整树中结点指针的指向。
 */

/**
 * offer interview 27
 */


public class Problem27 {
    public BinaryTreeNode convert(BinaryTreeNode root){
        BinaryTreeNode lastNodeList=null;
        convertNode(root,lastNodeList);
        while(lastNodeList!=null&&lastNodeList.leftNode!=null){
            lastNodeList=lastNodeList.leftNode;
        }
        return lastNodeList;
    }
    private void convertNode(BinaryTreeNode root, BinaryTreeNode lastNodeList) {
        if(root==null)
            return;
        BinaryTreeNode cuurent=root;
        if(cuurent.leftNode!=null){
            convertNode(cuurent.leftNode, lastNodeList);
        }
        cuurent.leftNode=lastNodeList;
        if(lastNodeList!=null)
            lastNodeList.rightNode=cuurent;
        lastNodeList=cuurent;
        if(cuurent.rightNode!=null){
            convertNode(cuurent.rightNode, lastNodeList);
        }
    }

}
