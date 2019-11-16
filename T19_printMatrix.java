import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

class T19_printMatrix {
    public static void main(String[] args) {
        // 定义一个整型数组:3行4列
        int matrix[][] = new int[4][5];

        // 获取行数---3行
        int lenX = matrix.length; // 3
        // 获取列数---4列
        int lenY = matrix[0].length; // 4

        System.out.println("\nlenX = " + lenX + "  lenY = " + lenY + '\n');

        int num = 1;
        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                matrix[x][y] = num++;
            }
        }

        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                System.out.print(matrix[x][y] + "\t");
            }
            System.out.println();
        }
        ArrayList<Integer> result =  printMatrix(matrix);
        System.out.println("\n"+ result);

    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int rows = matrix.length; // 获取行数
        int columns = matrix[0].length; // 获取列数
        int start = 0;
        ArrayList<Integer> result = new ArrayList<>();

        if(matrix == null || columns<=0 || rows<=0)
            return result;
        
        while (columns > start * 2 && rows>start * 2) {
            int endX = columns - 1 - start;
            int endY = rows - 1 - start;
            // 从左到右打印一行
            for (int i = start; i <= endX; ++i) {
                int number = matrix[start][i];
                result.add(number);
                System.out.print(number + " ");
            }
            // 从上到下打印一列
            if (start < endY) {
                for (int i = start + 1; i <= endY; ++i) {
                    int number = matrix[i][endX];
                    result.add(number);
                    System.out.print(number + " ");
                }
            }
            // 从右到左打印一列
            if (start < endX && start < endY) {
                for (int i = endX - 1; i >= start; --i) {
                    int number = matrix[endY][i];
                    result.add(number);
                    System.out.print(number + " ");
                }
            }
            // 从下到上打印一列
            if (start < endX && start<endY -1) {
                for (int i = endY - 1; i >= start+1; --i) {
                    int number = matrix[i][start];
                    result.add(number);
                    System.out.print(number + " ");
                }
            }
    
            ++start;
        }
        return result;
    }


    
}