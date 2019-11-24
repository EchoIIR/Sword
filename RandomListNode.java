public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    public RandomListNode creatNode(RandomListNode pHead, int label) {
        RandomListNode node = RandomListNode(label);
        this.next.label = node.label;
        this.next = node;
        // this.random = node;
        return pHead;
    }

    public RandomListNode addNode(RandomListNode pHead, int label) {
        RandomListNode node = RandomListNode(label);
        this.next.label = node.label;
        this.next = node;
        // this.random = node;
        return pHead;
    }
}
*/