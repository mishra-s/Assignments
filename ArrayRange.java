package com.company;
import java.util.*;
public class ArrayRange {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayElement = new int[arrayLength];
        for(int i = 0;i<arrayLength;i++)
            arrayElement[i] = sc.nextInt();
        int maxElement = arrayElement[0], minElement =arrayElement[0] ;

        for(int i =0;i<arrayLength;i++)
        {
            if( maxElement < arrayElement[i] )
            {
                maxElement = arrayElement[i];
            }
            if( minElement > arrayElement[i] )
            {
                minElement = arrayElement[i];
            }
        }
        int range = maxElement - minElement;
        System.out.print("Range: "+ range);

    }
}
