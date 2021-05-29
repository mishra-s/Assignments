package com.company;
import java.util.*;
public class LowerTraingularMatrix  {

    static boolean isLowerTraingularMatrix(int[][] matrix, int size)
    {
        for (int i = 0; i < size; i++)
            for (int j = i + 1; j < size; j++)
                if (matrix[i][j] != 0)
                    return false;
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        if (row != column)
            System.out.println("IT SHOULD BE SQUARE");
        else {
            int[][] matrix = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++)
                    matrix[i][j] = sc.nextInt();
            }

            if (isLowerTraingularMatrix(matrix, row))
                System.out.println("A Lower Traingular Matrix");
            else
                System.out.println("Not A Lower Traingular Matrix");
        }
    }

}


