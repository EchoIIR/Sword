class T7_Fibonacci {
    // Fibonacci数列：F(n)=F(n-1)+F(n-2)
    // 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
    public static void main(String[] args) {
        int n = 4;
        int fibonacciNum = Fibonacci(n);
        System.out.println(fibonacciNum);
    }

    public static int Fibonacci(int n) {
        if (n>40){
            System.out.println("\nWrong input!");
            return -1;
        }
        if (n <= 1){
            // 归
            return n;
        }
        else{  
            // 递
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
