/**
 * Created by lsc on 2018/11/16.
 * 题目：给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除
 该结点。
 */

public class Problem13 {
    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        head.nextNode=second;
        second.nextNode=third;
        head.data=1;
        second.data=2;
        third.data=3;
        Problem13 p13=new Problem13();
        p13.deleteNode(head, second);
        System.out.println(head.nextNode.data);
    }
    public void deleteNode(ListNode head,ListNode deListNode){
        if(deListNode==null||head==null){
            return;
        }
        if(head==deListNode){//删除头结点
            head=null;
        }else{
            if(deListNode.nextNode==null){//删除尾结点
                ListNode pointListNode=head;
                while(pointListNode.nextNode.nextNode!=null){
                    pointListNode=pointListNode.nextNode;
                }
                pointListNode.nextNode=null;
            }else{
                deListNode.data=deListNode.nextNode.data;
                deListNode.nextNode=deListNode.nextNode.nextNode;
            }
        }
    }
}
class ListNode
{
    int data;
    ListNode nextNode;
}