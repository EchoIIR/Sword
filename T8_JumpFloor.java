class T8_JumpFloor {
    // Fibonacci数列：F(n)=F(n-1)+F(n-2)
    // f(n) = 1,(n=1);
    //      = 2,(n=2);
    //      = f(n-2) + f(n-1), (n>2)

    public static void main(String[] args) {
        int n = -4;
        int jumpFloorNum = JumpFloor(n);
        System.out.println("\njumpFloorNum = " + jumpFloorNum);
    }

    public static int JumpFloor(int n) {
        if (n > 40 || n <= 0) {
            System.out.println("\nWrong input!");
            return -1;
        }
        if (n <= 2) {
            // 归 f(1) = 1;f(2) = 2
            return n;
        } else {
            // 递
            return JumpFloor(n - 1) + JumpFloor(n - 2);
        }
    }
}
