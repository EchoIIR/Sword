
class T15_ReverseList {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        t1.add(t2); // 链表的增加是一个一个节点(Node)的增加
        t1.add(t3);
        t1.add(t4);
        ListNode result = ReverseList(t1);
        System.out.println("\nresult.val = " + result.val);


    }

    public static ListNode ReverseList(ListNode head) {

        if (head == null){
            return null;
        }
            
        ListNode pre = null;
        ListNode nex = null;

        while (head.next != null) {
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
            System.out.println("\npre.val = " + pre.val);
            System.out.println("nex.val = " + nex.val);
            System.out.println("head.val = " + head.val);
        }
        
        head.next = pre;
        System.out.println("\nPre.val = " + pre.val);
        System.out.println("head.val = " + head.val);

        return head;
    }
}
