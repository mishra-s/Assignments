package com.company;
import java.util.*;
public class UpperTraingularMatrix {

    static boolean isUpperTraingularMatrix(int[][] matrix, int size)
    {
        for (int i = 1; i < size; i++)
            for (int j = 0; j < i; j++)
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

                if (isUpperTraingularMatrix(matrix, row))
                    System.out.println("An Upper Traingular Matrix");
                else
                    System.out.println("Not An Upper Traingular Matrix");
        }
    }

}

