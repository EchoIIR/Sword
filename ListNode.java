class ListNode {
    int val;
    ListNode next = null;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    // 1. 创建带头结点的单链表(尾插法建表)
    public  ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]); // 头结点
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }
    // 2. 打印链表
    public  void printList(ListNode head) {
        while (head != null) {
            if (head.next == null)
                System.out.println(head.val);
            else
                System.out.print(head.val + " --> ");

            head = head.next;
        }
    }
}

class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode();

        int[] arr = { 11, 22, 33, 44, 55 };

        ListNode head = l1.createList(arr); // 建表

        // 打印链表
        l1.printList(head);
   
    }

 

}