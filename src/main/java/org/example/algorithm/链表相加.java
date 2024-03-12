package org.example.algorithm;

import org.example.entity.ListNode;

import java.util.Stack;

public class 链表相加 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        Integer val= 0;
        Stack<ListNode> stack1= new Stack<>();
        Stack<ListNode> stack2= new Stack<>();
        ListNode head = new ListNode(0);
        while(head1!=null)
        {
            stack1.push(head1);
            head1= head1.next;
        }
        while(head2!=null)
        {
            stack2.push(head2);
            head2= head2.next;
        }
        while(stack1.size()!=0||stack2.size()!=0||val!=0)
        {
            int value = (stack1.size()==0?0:stack1.pop().val)+(stack2.size()==0?0:stack2.pop().val);

            int ag = (value+val)%10;
            ListNode newNode = new ListNode(ag);
            val =(value+val)/10;
            ListNode temp = head.next;
            head.next = newNode ;
            newNode.next = temp;
        }
        System.out.println(head.next);
        return head.next;

    }
}
