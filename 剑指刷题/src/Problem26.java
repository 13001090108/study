/**
 * Created by lsc on 2018/11/29.
 * 题目：实现函数复制一个复杂链表。在复杂链表中，每个结点除了有一个 next
 指针指向下一个结点外，还有一个指向链表中任意结点或 null。

 一定看图解
 https://blog.csdn.net/derrantcm/article/details/46721767

 */



public class Problem26 {
    public static void main(String[] args) {
        Problem26 testClone=new Problem26();
        ComplexListNode root=new ComplexListNode();
        ComplexListNode node1=new ComplexListNode();
        ComplexListNode node2=new ComplexListNode();
        ComplexListNode node3=new ComplexListNode();
        ComplexListNode node4=new ComplexListNode();
        root.next = node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        root.data=1;
        node1.data=2;
        node2.data=3;
        node3.data=4;
        node4.data=5;
        root.sibling=node2;
        node1.sibling=node4;
        node3.sibling=node1;
        ComplexListNode result=testClone.clone(root);
        while(result != null) {
            System.out.print(result.data);
            if(result.sibling != null) {
                System.out.println(":"+result.sibling.data);
            }
            else {
                System.out.println(":"+null);
            }
            result = result.next;
        }
    }
    public ComplexListNode clone(ComplexListNode head){
        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }
    public void cloneNodes(ComplexListNode head){
        ComplexListNode node=head;
        while(node!=null){
            ComplexListNode cloneNode=new ComplexListNode();
            cloneNode.data=node.data;
            cloneNode.next=node.next;
            cloneNode.sibling=null;
            node.next=cloneNode;
            node=cloneNode.next;
        }
    }
    public void connectSiblingNodes(ComplexListNode head){
        ComplexListNode node=head;
        while(node!=null){
            ComplexListNode clonedNode=node.next;
            if(node.sibling!=null){
                clonedNode.sibling=node.sibling.next;
            }
            node=clonedNode.next;
        }
    }
    /**
     * 刚复制结点和被复制结点拆开，还原被复制的链表，同时生成监制链表
     *
     * @param head 链表的头结点
     * @return 复制链表的头结点
     */
    public  ComplexListNode reconnectNodes(ComplexListNode head) {
        // 当链表为空就直接返回空
        if (head == null) {
            return null;
        }
        // 用于记录复制链表的头结点
        ComplexListNode newHead = head.next;
        // 用于记录当前处理的复制结点
        ComplexListNode pointer = newHead;
        // 被复制结点的next指向下一个被复制结点
        head.next = newHead.next;
        // 指向新的被复制结点
        head = head.next;
        while (head != null) {
            // pointer指向复制结点
            pointer.next = head.next;
            pointer = pointer.next;
            // head的下一个指向复制结点的下一个结点，即原来链表的结点
            head.next = pointer.next;
            // head指向下一个原来链表上的结点
            head = head.next;
        }

        // 返回复制链表的头结点
        return newHead;
    }
}

class ComplexListNode
{
    int data;
    ComplexListNode next;
    ComplexListNode sibling;
}
