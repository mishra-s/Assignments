package com.company;
import java.util.*;
public class ArrayType {

    static int arrayType(int[] array, int length)
    {
        int flagEven = 0, flagOdd = 0;
        for(int i =0;i<length;i++)
        {
            if(array[i]%2==0)
            {
               flagEven = 1;
            }
            else
            {
                flagOdd = 1;
            }
        }
        if( flagOdd == 0 && flagEven == 1)
            return 1;
        else if (flagOdd == 1 && flagEven == 0 )
            return 2;
        else
            return 3;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayElement = new int[arrayLength];
        for(int i = 0;i<arrayLength;i++)
            arrayElement[i] = sc.nextInt();
        int checkType = arrayType(arrayElement,arrayLength);
        if(checkType==1)
            System.out.println("ARRAY TYPE: EVEN");
        else if(checkType==2)
            System.out.println("ARRAY TYPE: ODD");
        else
            System.out.println("ARRAY TYPE: MIXED");
    }


}
