class T10_RectCover {
   // 
    // f(n) = 1 ，(n=1);
    //      = 2 ,(n=2);
    //      = 3 ,(n=3);
    //      = 5 ,(n=4);
    // ..............;
    //      = f(m-2) + f(m-1),(n = m)
    public static void main(String[] args) {
        int n = 4;
        System.out.println("RectCover = " +  RectCover(n));
    }

    public static int RectCover(int target) {
        if (target < 0){
            return 0;
        }
        if(target <= 2){
            return target;
        }
        else{
            return RectCover(target-1) +  RectCover(target-2);
        }

    }
}
