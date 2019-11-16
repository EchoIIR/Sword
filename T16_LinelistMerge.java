

/*
题目描述
输入两个单调递增的链表，
输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。
*/



class T16_LinelistMerge {
    public static void main(String[] args) {

        int [] oArr = {1,3,5,7,9};
        int [] eArr = {2,4,6,8,10};

        // 创建链表
        ListNode oList = ListNode.createList(oArr);
        ListNode eList = ListNode.createList(eArr);
        
        // 打印链表
        ListNode.printList(oList);
        ListNode.printList(eList);

        // 合并并打印链表
        ListNode result =  MergeNode(oList,eList);
        ListNode.printList(result);

    }

    public static ListNode MergeNode(ListNode list1,ListNode list2){
        ListNode head = null;
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            head = list1;
            head.next = MergeNode(list1.next, list2);
        }else{
            head = list2;
            head.next = MergeNode(list1, list2.next);
        }
        return head;   
    }
}