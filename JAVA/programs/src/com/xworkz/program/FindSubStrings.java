package com.xworkz.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindSubStrings {

    public static void main(String[] args) {
        int[] arr={1,4,3,5,6};
        int sum=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
               // System.out.println(i +" "+j);
                int temp = 0;
                for (int k=i;k<=j;k++){
                   
                    temp+=arr[k];
                }
                System.out.print(temp+" ");
                sum=Math.max(sum,temp);

            }
        }
        System.out.println();
        System.out.println("sum "+sum);

    }
}
