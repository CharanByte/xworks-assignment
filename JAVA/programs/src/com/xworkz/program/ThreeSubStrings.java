package com.xworkz.program;

public class ThreeSubStrings {

    public static void main(String[] args) {
        int [] arr={1,4,3,5,6};
        int n=arr.length;
        int s=3;
        for (int i=0;i<n-s+1;i++){
            int j=i+s-1;
            for (int k=i;k<=j;k++){
               // System.out.print(k+" ");

                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }
}
