package com.xworkz.program;

import java.util.*;
import java.util.stream.Collectors;

public class Compar {

    public static void main(String[] args) {
        int[] a={3,2,5,7,1,9,6,3};
        ArrayList<Integer> list=new ArrayList<>();

        for (int b:a){
            list.add(b);
        }

        System.out.println(list);

//        list.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
//        System.out.println(list.stream().map(n->n*2).collect(Collectors.toList()));
//       List<Integer> l=list.stream().map(n->n).collect(Collectors.toList());
//        System.out.print(l);
//        Optional<Integer> f=list.stream().distinct().findFirst();
//        System.out.println(f);
        List<Integer> integers=list.stream().sorted().collect(Collectors.toList());
        System.out.println(integers);
        Optional<Integer> g=list.stream().distinct().sorted().skip(1).findFirst();
        System.out.println(g);

        List<Integer> integer=list.stream().sorted((q,e)->Integer.compare(e,q)).collect(Collectors.toList());
        System.out.println(integer);
    }
}
