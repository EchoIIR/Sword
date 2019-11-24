class T24_FindPath {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(8);
        t1.addLeft(8);
        t1.addLeft(6);
        t1.addRigth(10);
        Solution s1 = new Solution();
        ArrayList<ArrayList<Integer>> r =  s1.FindPath(t1, 14);
    }
}

public class Solution {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();

    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        

        if (root == null)
            return result;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return result;
    }
}