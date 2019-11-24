import java.util.Arrays;

class T23_VerifySquenceOfBST {
    public static void main(String[] args) {
        int[] sequence = { 5, 7, 6, 9, 11, 10, 8 };// true
        // int [] sequence = {7,4,6,5}; //false
        System.out.println(VerifySquenceOfBST(sequence));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        int len = sequence.length;
        if (len == 0) {
            return false;
        }
        // 根节点值
        int root = sequence[len - 1];
        // 递归出口
        int i = 0; // 技巧
        for (; i < len - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i; // 技巧
        for (; j < len - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }

        boolean left = true;
        boolean right = true;
        // 递归入口
        if (i > 0) { 
            // 判断左子树是否为二叉搜索树
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }
        if (i < len - 1) { 
            // 判断左子树是否为二叉搜索树
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len - 1));
        }
        return left && right;
    }
}
