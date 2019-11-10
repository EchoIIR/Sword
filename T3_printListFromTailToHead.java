
import java.util.ArrayList;
import java.util.Stack;   // 
//import java.util.LinkedList;

public class T3_printListFromTailToHead {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        t1.add(t2); // 链表的增加是一个一个节点(Node)的增加
        t1.add(t3);
        t1.add(t4);
        
        //LinkedList officers = new LinkedList();


        ArrayList<Integer> list = new ArrayList<>();
        list =  printListFromTailToHead(t1); // 返回到数组中
        System.out.println(list);
        
    }
    
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        /* ============= 法一：利用栈基于循环输出元素 。==================
            1. 栈先入后出，符合题意，遍历链表元素，存在栈中，再输出栈中元素
            2. 优点：无序考虑栈溢出。
            3. 缺点：涉及到链表，栈，代码较为复杂
        */ 
        // ================= code1 ================================

       Stack<Integer> sc = new Stack<>(); //栈是先进后出
       while(listNode != null){ //若当前ListNode类对象不为空
           sc.push(listNode.val);//则将当前对象的头节点存入栈中
           //将当前对象的下一个节点对象赋给listNode对象，对象传对象
           listNode = listNode.next; 
       }
        ArrayList<Integer> list = new ArrayList<>();
        while(!sc.isEmpty()){  //若当前的栈内存不为空
            list.add(sc.pop());//出栈，先进后出，即先输出后进来的
        }
        return list;
        
        /* ============= 法二：改变链表节点指针，使之反向 ===============
            1. 缺点：修改了原来链表的结构
            2. 优点：简单易行。
        */
        // code2
        

        /* ============= 法三：使用迭代（迭代本质为栈结构）=================
            1. 优点：代码简短
            2. 缺点：链表长时，调用层级很深，导致函数栈溢出。
        
        */ 
        
        /* ============= 法四：遍历链表元素，用中间列表保存，逆序打印 ========
            1. 优点：代码简短
            2. 缺点：链表长时，调用层级很深，导致函数栈溢出。
        */ 
        // code4

    }
}










