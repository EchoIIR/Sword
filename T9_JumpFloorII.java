class T9_JumpFloorII {
    // 
    // f(n) = 1 = 2^0 =  2^(1-1) = 2^(n-1),(n=1);
    //      = 2 = 2^1 = 2^(2-1) = 2^(n-1),(n=2);
    //      = 4 = 2^2 = 2^(3-1) = 2^(n-1),(n=3);
    //      = 8 = 2^3 = 2^(4-1) = 2^(n-1),(n=4);
    // ..............;
    //      = 2^(n-1),(n = n)
    public static void main(String[] args) {
        int n = 4;
        int result = jumpFloorII(n);
        System.out.println("\nT9_JumpFloorII:" + result);
    }

    public static int jumpFloorII(int n) {
        if (n > 40 || n <= 0) {
            System.out.println("\nWrong input!");
            return -1;
        }
        //注意，返回值是一个double类型
        int result = (int)Math.pow(2, n-1);
        return result;
    }
}
