package org.study;

import java.util.Arrays;
import java.util.TreeSet;

public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++)
        {
          A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
       int A[]=new SortedSquares().sortedSquares(new int[]{-4,-1,0,3,10});
       for(int i:A)
       {
           System.out.println(i);
       }
    }
}
