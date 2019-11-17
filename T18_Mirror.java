class T18_Mirror {
    public static void main(String[] args) {
        
    }

    public void Mirror(TreeNode root){
          if(root ==null)
             return;
          if(root.left ==null && root.right ==null)
              return;
          //交换左右子树
          //TreeNode tmp = new TreeNode(); 
          // TreeNode的构造函数有值，这样牛客网报错
          TreeNode tmp = root.left;
          root.left = root.right;
          root.right = tmp;
          //递归将两给子树的左右子树镜像
          if(root.left !=null)
              Mirror(root.left);
          if(root.right !=null)
              Mirror(root.right);
     
      }
}
