/*请实现一个函数:
将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.
则经过替换之后的字符串为We%20Are%20Happy。
*/
class T2_ReplaceBlack{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(str));
        /* ======== test ===========
        for (int x=0; x<str.length();x++ ){
            System.out.print(str.charAt(x));
        }
        int length = str.length();          // 返回长度（字符数）:字符串的实际长度
        int originalLength= str.capacity(); // 返回当前容量: 字符串所占容器的总大小
        System.out.println("\nlength = " + length);
        System.out.println("originalLength = " + originalLength); 

        StringBuffer str2 = new StringBuffer(); // 默认长度是16
        System.out.println(str2.length());
        System.out.println(str2.capacity());
        */
    
    }
    /*
    
    */
    public static String replaceSpace(StringBuffer str) {
        /* 思路：
        1、 遍历字符串，确定空格数，从而算出新的str的大小
        2、 从后往前，依次替换空格为%20
        3、 返回结果
        */
        int length = str.length();          // 返回长度：所含字符个数。:13
        int originalLength= str.capacity(); // 返回当前容量: 字符串实际大小:29
        int newLength = 0;
        String result;
        // 牛客网加了这部分判断报错：只能通过50%case，注释掉
        if(str == null || length==0){
            String message = "wrong input";
            return message;
        }

        // 1.统计空格数量
        int numBlack = 0;
        for (int x=0; x<str.length(); x++){
            if (str.charAt(x) == ' '){
                //  char类型的空格换成int是32.//   char类型可以直接跟int类型进行比较.
                numBlack++;
            }
        }
        // 2. 计算新的字符串的长度
        newLength = length + 2*numBlack; // 17,每出现一个空格，字符串替换之后长度增加2
        // 牛客网加了这部分判断报错：只能通过50%case，注释掉
        if (newLength > originalLength){
            String message = "wrong input";
            return message;
        }
        System.out.println(str.length());
        str.setLength(newLength);   // 原来放teng13个元素，现在要放17个，必须腾出来
        System.out.println(str.length());       
        // 3. 定义index指向原始字符串的末尾和替换之后的字符串的末尾，从后往前替换
        int originalIndex = length-1 ;
        int newIndex = newLength-1;

        while(originalIndex>=0){
            if(str.charAt(originalIndex) == ' '){
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }
            else{
                str.setCharAt(newIndex--, str.charAt(originalIndex));
            }
            --originalIndex ; 
        }
        result = str.toString();
        return result ;
    }
}