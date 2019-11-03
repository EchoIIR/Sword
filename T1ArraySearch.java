/*题目描述:
    在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
    请完成一个函数，
输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。 
*/
class T1ArraySearch {

    public static void main(String[] args) {

        // 定义一个整型数组:3行4列
        int matrix[][] = new int[3][4];

        // 获取行数---3行
        int lenX = matrix.length; // 3
        // 获取列数---4列
        int lenY = matrix[0].length; // 4

        System.out.println("\nlenX = " + lenX + "  lenY = " + lenY + '\n');

        int num = 0;
        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                matrix[x][y] = num++;
            }
        }

        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
        // test
        boolean a = Find(5,matrix);
        System.out.println(a);  

    }

    public static boolean Find(int target, int[][] matrix) {
        /*思路：
        1、 每次取数组固定位置：右上角的元素
        2、将其与目标数比较，相同输出，不同剔除一行或者一列
        3、重复1-2直到找到元素或遍历完整个数组
        */
        boolean found = false;
        // 获取行数---3行
        int rows = matrix.length;
        // 获取列数---4列
        int columns = matrix[0].length;

        if (matrix != null && rows > 0 && columns > 0) {// 二维矩阵不为空
            // 右上角的元素坐标：row,column
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0) {
                // 还没遍历完时
                if (matrix[row][column] == target) {
                    // 右上角和target正好相等就结束寻找
                    found = true;
                    return found;
                    // break;
                } else if (matrix[row][column] > target) {
                    // 右上角>target,剔除matrix最后一列
                    --column;
                } else {
                    // 右上角<target,剔除matrix上面一行
                    ++row;
                }
            }
            found =  false;
            return found;

        }
        System.out.println("matrix is wrong!");
        found =  false;
        return found;
    }
}