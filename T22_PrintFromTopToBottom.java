class T22_PrintFromTopToBottom {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        t1.addLeft(8);
        t1.addLeft(6);
        t1.addRigth(10);
        ArrayList<Integer> list = new ArrayList<>();
        list = PrintFromTopToBottom(t1);
        for (int i = 0; i <list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        // 方法一：
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                continue;
            }
            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        return list;
       // 方法二：
        // Deque<TreeNode> deque = new LinkedList<>();
        // ArrayList<Integer> res = new ArrayList<>();
 
        // if(root == null)
        //     return res;
 
        // deque.add(root);
 
        // while(!deque.isEmpty()){
        //     TreeNode node = deque.getFirst();
        //     deque.pollFirst();
        //     res.add(node.val);
 
        //     if(node.left != null)
        //         deque.addLast(node.left);
 
        //     if(node.right != null)
        //         deque.addLast(node.right);
        // }
        // return res;
    }
}
