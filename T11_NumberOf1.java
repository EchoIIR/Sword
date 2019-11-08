class T11_NumberOf1{
    public static void main(String[] args) {
        int num = 8;
        
        int count = NumberOf1(num);
        System.out.println("\n NumberOf1: " + count); 
    }


    public static int NumberOf1(int num){
      
        System.out.println("\n The num " + num + " trasfer using Table is :" ); 
        char[] table = {'0','1'};

        int base = 1;
        int offset = 1;
        char[] result = new char[32]; // 按占位最大的二进制来分，用32位存结果
        int pos = result.length;
        if (num == 0){
            System.out.println("0");
            return 0;
        }
        while (num != 0){
            int temp = num & base;        // 取数
            result[--pos] = table[temp]; 
            num = num>>>offset;
        }
       
        //System.out.println("\n result2"); 
        int count =0;
        for (int x=0; x<=result.length-1;x++){
            // 倒序打印数组元素
            // System.out.print(result[x]);
            if(result[x] == '1'){
                count++;
            }
        }
        return count;
    }
}