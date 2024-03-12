package org.example.algorithm;

import org.example.entity.ListNode;

import java.util.HashMap;
import java.util.HashSet;

public class 链表中环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead.next==null){return null;}
        HashSet<ListNode> array = new HashSet<>();
        while(pHead!=null)
        {
            if(array.contains(pHead))
            {
                return pHead;
            }
            array.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}
