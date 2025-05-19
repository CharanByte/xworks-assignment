package com.xworkz.program;

public class PairReverse {

    public static String rev(String s) {
        String r="";
        for (int i=s.length()-1;i>=0;i--) {
            r += s.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {

        String [] words = {"cd","ac","dc","ca","zz"};
        int temp=0;
        for(int i=0;i<words.length-1;i++){

            for (int j=i+1;j<words.length;j++){
                String a=words[i];
                String b=words[j];
                String re=rev(b);
                System.out.println(re);
               if(a.equals(re)){
                   temp++;
               }
                }

            }
        System.out.println(temp);
        }
    }

