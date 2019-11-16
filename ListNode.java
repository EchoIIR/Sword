public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    // 1. 创建单链表(尾插法建表)
    public static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]); // 头结点
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            tail.next = newNode; // 指向下一个结点即可。
            tail = newNode;
        }
        return head;
    }

    // 2. 打印链表
    public static void printList(ListNode head) {
        while (head != null) {
            if (head.next == null)
                System.out.println(head.val);
            else
                System.out.print(head.val + " --> ");

            head = head.next; // head指向下个结点
        }
    }

    // 3. 在建好的链表中的第k个位置插入一个值为val的结点
    public static ListNode insertNode(ListNode head, int k, int val) {
        ListNode preNode = head; // 临时指针,用于指向要插入位置的前一个结点

        if (k < 1)
            return head;
        if (k == 1) // 如果在第一个位置插入(将插在第1个结点之前)
        {
            ListNode newNode = new ListNode(val); // 创建该结点
            newNode.next = preNode;
            head = newNode;
            return head;
        }

        while (k-- > 2) // 使preNode指向第k个位置的前一个结点
        {
            preNode = preNode.next;
        }

        ListNode newNode = new ListNode(val); // 创建该新结点
        // 插入
        newNode.next = preNode.next;
        preNode.next = newNode;

        return head;
    }

    // 4. 删除结点(删除第k个结点)
    public static ListNode delNode(ListNode head, int k) {
        ListNode preNode = head; // 临时指针,用于指向要删除位置的前一个结点

        if (k < 1) // 不删任何结点
            return head;
        if (k == 1) // 删除第一个结点
        {
            head = head.next; // 将指针往后移动一位就相当于删除了第一个结点
            return head;
        }
        
        while (k-- > 2) // 使preNode指向第k个结点的前面一个结点
        {
            preNode = preNode.next;
        }
        // 删除结点(通过跳过待删除结点来实现删除结点的效果)
        preNode.next = preNode.next.next;

        return head;
    }

}
