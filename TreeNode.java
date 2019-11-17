public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

    public void addLeft(int value){  
        TreeNode leftChild = new TreeNode(value);  
        this.left = leftChild;  
    }  
    public void addRigth(int value){  
        TreeNode rightChild = new TreeNode(value);  
        this.right = rightChild;  
    }  

}