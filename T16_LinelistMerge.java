/*
题目描述
输入两个单调递增的链表，
输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。
*/

class T16_LinelistMerge {
    public static void main(String[] args) {

        ListNode t1 = new ListNode();
    
    }

    public static ListNode Merge(ListNode l1, ListNode l2) {
        
            if (l1 == null) {
                return l2;
            }
    
            if (l2 == null) {
                return l1;
            }
    
            
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode mergeListNode;
            if (l1.val > l2.val) {
                mergeListNode = l2;
                temp2 = l2.next;
            } else {
                mergeListNode = l1;
                temp1 = l1.next;
            }
            ListNode mergeListNodePointer = mergeListNode;
    
    
            //每次循环只前进一个指针
            while (temp1 != null && temp2 != null) {
                if (temp1.val > temp2.val) {
                    mergeListNodePointer.next = temp2;
                    mergeListNodePointer=mergeListNodePointer.next;
                    temp2 = temp2.next;
                } else {
                    mergeListNodePointer.next = temp1;
                    mergeListNodePointer=mergeListNodePointer.next;
                    temp1 = temp1.next;
                }
            }
    
            //将剩余的节点拼接起来
            if (temp1 != null) {
                mergeListNodePointer.next = temp1;
            }
    
            if (temp2 != null) {
                mergeListNodePointer.next = temp2;
            }
    
            return mergeListNode;
        }
}