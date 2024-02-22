package org.example.algorithm;

import org.example.entity.ListNode;

import java.util.Objects;

/**
 * <span style="color:'red'">
 *     pre就是反转后的头结点前一个节点
 * 而start就是反转后的尾节点，then就是下一个要反转的节点
 * 执行一次就翻转一个节点这样子就可以使用n-m 来操纵一共反转多少个节点
 * </span>
 *
 *
 *
 */
public class 指定范围的翻转链表 {

        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (Objects.isNull(head) || Objects.isNull(head.next) || m == n) {
                return head;
            }

            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;

            // 移动到翻转起始位置的前一个节点
            for (int i = 0; i < m - 1; i++) {
                pre = pre.next;
            }

            ListNode start = pre.next; // 翻转起始节点
            ListNode then = start.next; // 起始节点的下一个节点

            // 逐个翻转节点
            for (int i = 0; i < n - m; i++) {
                start.next = then.next;
                then.next = pre.next;
                pre.next = then;
                then = start.next;
            }

            return dummy.next;
        }


}
