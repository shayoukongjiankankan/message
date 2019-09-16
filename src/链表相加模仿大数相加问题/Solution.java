package 链表相加模仿大数相加问题;
//第一，反转链表，比较链表长度，进行相加

import java.util.List;

/**
 * Definition for singly-linked list.
 * */
   class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1=l1;
        ListNode node2=l2;
        ListNode count1=node1;
        ListNode count2=node2;
        int length1=0,length2=0;
        while(count1!=null){
            length1++;
        }
        while(count2!=null){
            length2++;
        }
        if (length1>=length2){
            int R=0;
            int sum=0;
            ListNode pre=new ListNode(-1);
            ListNode currentNode=pre.next;
           while (node2!=null){
               if (node1.val+node2.val+R>=10){
                   sum=(node1.val+node2.val+R)%10;
                   R=(node1.val+node2.val+R)/10;
               }else {
                   sum=node1.val+node2.val+R;
                   R=0;
               }
               currentNode=new ListNode(sum);
               currentNode=currentNode.next;
               node1=node1.next;
               node2=node2.next;
           }
           while(node1!=null){
               if (node1.val+R>=10){
                   sum=(node1.val+R)%10;
                   R=(node1.val+R)/10;
               }else {
                   sum=node1.val+R;
                   R=0;
               }
               currentNode=new ListNode(sum);
               currentNode=currentNode.next;
               node1=node1.next;
           }
           if (R!=0){
               currentNode=new ListNode(R);
           }
           return pre.next;

        }else {
            int R=0;
            int sum=0;
            ListNode pre=new ListNode(-1);
            ListNode currentNode=pre.next;
            while (node1!=null){
                if (node1.val+node2.val+R>=10){
                    sum=(node1.val+node2.val)%10;
                    R=(node1.val+node2.val+R)/10;
                }else {
                    sum=node1.val+node2.val+R;
                    R=0;
                }
                currentNode=new ListNode(sum);
                currentNode=currentNode.next;
                node1=node1.next;
                node2=node2.next;
            }
            while(node2!=null){
                if (node2.val+R>=10){
                    sum=(node2.val+R)%10;
                    R=(node2.val+R)/10;
                }else {
                    sum=node2.val+R;
                    R=0;
                }
                currentNode=new ListNode(sum);
                currentNode=currentNode.next;
                node1=node1.next;
            }
            if (R!=0){
                currentNode=new ListNode(R);
            }
            return pre.next;
        }

    }

    private ListNode reverse(ListNode l2) {
        if (l2==null){
            return l2;
        }
        ListNode pre=null;
        ListNode aft=null;
        while (l2!=null){
            aft=l2.next;
            l2.next=pre;
            pre=l2;
            l2=aft;
        }
        return pre;
    }
}
/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int addNum = 0;
        while(q!=null){
            if(p.next==null && q.next!=null)
                p.next = new ListNode(0);
            if(q.next==null && p.next!=null)
                q.next = new ListNode(0);
            int sumAll = addNum + p.val + q.val;
            p.val = sumAll % 10;
            addNum = sumAll / 10;
            if(p.next == null && q.next == null && addNum!=0)
                p.next = new ListNode(addNum);
            p = p.next;
            q = q.next;
        }
        return l1;
    }
}*/