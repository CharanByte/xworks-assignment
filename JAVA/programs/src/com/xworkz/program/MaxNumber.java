package com.xworkz.program;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        String [] sentence={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        List<String> list=new ArrayList<>();
        int max=0;
        for (String a:sentence){
        String [] b=a.split(" ");

        for (String d:b){
            list.add(d);
        }
            if(list.size()>max){
                max= list.size();
                list.clear();
                System.out.println(max);
            }
            else {
                list.clear();
            }
    }

        System.out.println(max);
    }
}
