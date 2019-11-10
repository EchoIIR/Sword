class T14_FindKthToTail {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        t1.add(t2); // 链表的增加是一个一个节点(Node)的增加
        t1.add(t3);
        t1.add(t4);
        
        //LinkedList officers = new LinkedList();

        ListNode result = new ListNode(0);

        result  =  FindKthToTail(t1,2); // 返回到数组中
        System.out.println(result.val);

    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if(head == null || k <=0){
            return null;
        }
        ListNode first = head, second = head;
        for(int i=0; i<=k-1; i++){
            //如果k超出了节点的个数
            if(first == null){
                return null;
            }else{
                first = first.next;
            }
        }
        
        while(first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
