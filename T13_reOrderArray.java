class T13_reOrderArray {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 4, 3, 5, 6, 8, 9, 7 };
        reOrderArray(array);

    }

    public static void reOrderArray(int[] array) {
        /*
         * ===== 不稳定的算法 ================ int length = array.length; int [] result = new
         * int [length]; int oddIndex = 0; int evenIndex = length-1; int num = 0; //
         * 遍历数组，定义两个指针，一个指最开始，一个指最后 for(int i=0; i<length;i++ ){ num = array[i]; if
         * (num%2 != 0){// 奇数 result[oddIndex] = num; oddIndex++; }else{
         * result[evenIndex] = num; evenIndex--; } } // int newScores[] = (int[])
         * scores.clone(); //array = result;
         * 
         * array = result.clone();
         * 
         * for(int i = 0; i< result.length; i++){ System.out.println(result[i]); }
         */
        // ======== 冒泡法 ================
        /* ======== 看不懂 ===================

        if (array == null || array.length == 0) {
            return;
        }
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(array[i])) % 2 != 0) {// 奇数
                int tmp = array[i]; // 奇数
                int j = i;
                while (j > m) {
                    array[j] = array[j - 1]; // 后移
                    j--;
                }
                m = j + 1;
                array[j] = tmp;
            }
        }           
        */ 
        // 奇数就下一个，偶数就找下一个奇数，交换位置同时中间的偶数往后移动
        int i = 0;
        int length = array.length;
        while(i<length){
            if(Math.abs(array[i])%2 == 0){//array[i]为偶数
                int j = i + 1;
                // 找array[i]后面出现的第一个奇数array[j]
                while(Math.abs(array[i])%2 == 0){
                    if(j == length-1){
                        return;         //找完了就退出
                    }
                    j++;
                }
                // 找到了就交换array[i]，array[j],并将i+1~j-1之间的偶数往后移动
                int tmp = array[i];
                array[i] = array[j];
                int count = j-i;
                while(count>1){//从后往前移动，最前面的在循环外移动
                    array[i + count] = array[i + count - 1];
                    count--;
                }
                array[i+1] = tmp;

            }
            else{
                i++;
            }  
        }

    }

}