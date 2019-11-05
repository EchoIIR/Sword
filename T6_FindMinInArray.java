class T6_FindMinInArray{
    /*
    题目描述
    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    */
    public static void main(String[] args) {
        // 1. 排好序的数组，移动前若干个元素到末尾，生成旋转数组
        // 定义一个整型数组:3行4列
        //int [] numbers = {1,2,3,4,5};
        int [] rotateNumbers = {3,4,5,1,2,3};
        // 2. 输出旋转数组中的最小值
        int result = minNumberInRotateArray(rotateNumbers);
        System.out.println(result);
    }
    public static int minNumberInRotateArray(int [] array) {
        
        int result;
        int length = array.length;
        if(array == null || length<=0){
            System.out.println("Wrong input!");
            return 0;
        // NOTE：给出的所有元素都大于0，
        // 若数组大小为0，请返回0。
        }

        int index1 = 0;
        int index2 = length-1;
        int indexMid = index1;

        while(array[index1] >= array[index2]){
            // indexMid指向最终结果
            // 条件不满足时，直接返回indexMid = index1;
            if(index2 - index1 == 1){   // 找到了
                indexMid = index2;
                break;  
            }
            indexMid = (index1 + index2)/2;
            if (array[indexMid] >= array[index1]){
                index1 = indexMid;
            }
            else{
                index2 = indexMid;
            }
        }

        result = array[indexMid];
        return result;
    }
}