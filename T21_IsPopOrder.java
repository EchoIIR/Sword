import java.util.ArrayList;
import java.util.Stack;

class T21_IsPopOrder {
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        // int [] popA = {4,5,3,2,1}; // true
        int [] popA = {4,3,5,1,2};  // false
        boolean isPopOrder = IsPopOrder(pushA, popA);
        System.out.println(isPopOrder);
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0 || popA.length != pushA.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            // 先把压栈序列存在中站栈中
            stack.push(pushA[i]);
 
            while (!stack.isEmpty() && stack.peek() == popA[j]){
                // 边出栈边判断
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
