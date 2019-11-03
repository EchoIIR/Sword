/*请实现一个函数:
将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.
则经过替换之后的字符串为We%20Are%20Happy。
*/
class T2_ReplaceBlack{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy."); 
        //StringBuffer result = replaceSpace(str);

        for (int x=0; x<str.length(); x++){
            System.out.print(str.charAt(x));
        }
        for (int x=0; x<str.length(); x++){
            if (str.charAt(x) == " "){
                numBlack++;
            }
            //System.out.print(str.charAt(x));
        }
        System.out.println("numBlack = " + numBlack);
    }
    public static String replaceSpace(StringBuffer str) {
        /* 思路：
        1、 遍历字符串，确定空格数，从而算出新的str的大小
        2、 从后往前，依次替换空格为%20
        3、 返回结果
        */
        int length = str.length();

        // 统计空格数量
        int numBlack = 0;
        for (int x=0; x<str.length(); x++){
            if (str.charAt(x) == " "){
                numBlack++;
            }
            //System.out.print(str.charAt(x));
        }
        System.out.println("numBlack = " + numBlack);


        return result ;
    }
}