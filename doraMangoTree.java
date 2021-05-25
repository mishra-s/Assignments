package com.company;
import java.util.*;

public class doraGarden {


   static int checkMangoTree( int treeNumber, int rowNumber, int columnNumber )
    {
         if( treeNumber <= 0  || treeNumber > ( rowNumber * columnNumber) )
             return -1;
         if( treeNumber <= columnNumber || treeNumber%columnNumber == 1 || treeNumber%columnNumber == 0 )
             return 1;
         else
             return 0;

    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

        int numberOfRow =       sc.nextInt();
        int numberOfColumn =    sc.nextInt();
        int treeNumber =        sc.nextInt();


        int flagMangoTree = checkMangoTree( treeNumber, numberOfRow,numberOfColumn);

        if( flagMangoTree == 1)
            System.out.println("Yes It is a Mango Tree");

        else if( flagMangoTree == -1 )
            System.out.println("You are in someone else garden!!");

        else
            System.out.println("No, It is not a Mango Tree");


    }
}
