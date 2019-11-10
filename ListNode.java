
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    public void add(ListNode newNode){		// 将节点加入到合适的位置
        // 如果下一个节点为空，则把新节点设置在next的位置上
        if(this.next==null){		
            this.next = newNode ;
        }
        // 如果不为空，说明还没到尾巴，则需要向下继续找next
        else{		
            this.next.add(newNode) ;
        }
    }

}
