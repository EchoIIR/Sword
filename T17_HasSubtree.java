class T17_HasSubtree {
    public static void main(String[] args) {

    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
       // boolean result = false;
        if(root1 == null || root2 == null){
            return false;
        }else{
            // A,B不为空时
            return DoesTree1HaveTree2(root1, root2) || // 看A为根节点的子树中有无B
                    DoesTree1HaveTree2(root1.left, root2) || // 看A的左子树中有无B
                    DoesTree1HaveTree2(root1.right, root2); // 看A的右子树中有无B
        }

    }

    public static boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if(root2 == null){
            return true; //如果子树先达到 null ，那么一定是其子树
        }
        if(root1 == null){
            return false; // 如果A树先达到 null ，那么B一定非A子树
        }
        if(root1.val != root2.val){
            return false;
        }else{
            // A的根节点 = B的根节点
            return DoesTree1HaveTree2(root1.left, root2.left) && // 看A的左子树 = B的左子树？
            DoesTree1HaveTree2(root1.right, root2.right);        // 看A的右子树 = B的右子树？
        }

    }

}

