package com.company;
import java.util.*;

public class doraMangoTree {


   static int checkMangoTree( int rowIndex, int columnIndex, int rowNumber, int columnNumber)
    {
         if( rowIndex > rowNumber || columnIndex > columnNumber  )
            return -1;
         if( rowIndex == 1 && ( columnIndex == 1 || columnIndex == columnNumber ) )
             return 1;
         else
             return 0;

    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

        int numberOfRow =       sc.nextInt();
        int numberOfColumn =    sc.nextInt();
        int queryRowIndex =     sc.nextInt();
        int queryColumnIndex =  sc.nextInt();

        int flagMangoTree = checkMangoTree(queryRowIndex, queryColumnIndex, numberOfRow,numberOfColumn);

        if( flagMangoTree == 1)
            System.out.println("Yes It is a Mango Tree");

        else if( flagMangoTree == -1 )
            System.out.println("You are in someone else garden!!");

        else
            System.out.println("No, It is not a Mango Tree");


    }
}
