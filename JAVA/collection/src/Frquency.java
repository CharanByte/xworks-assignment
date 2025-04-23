import java.util.*;

public class Frquency {
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//
//        int size=scanner.nextInt();
//        int [] arr=new int[size];
//        for (int i=0;i<size;i++){
//            arr[i]=scanner.nextInt();
//        }
//      for (int a:arr){
//          System.out.print(a+" ");
//      }

      int[] array={3,4,3,4,5,1,3,4,2,1,6,8};

       HashMap<Integer,Integer> map=new HashMap<>();

       for (int i:array){
           map.put(i, map.getOrDefault(i,0)+1);
       }

       for (Map.Entry<Integer,Integer> ent:map.entrySet()){
           System.out.println(ent.getKey()+" "+ent.getValue());
       }

       int max=0;
        int key=0;
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> ent:map.entrySet()){

            if(ent.getValue()>max){
                max= ent.getValue();
                key=ent.getKey();

            }

        }
        for (int a:map.keySet()){
            System.out.print(a+" ");
            if(map.get(a)==max){
                list.add(a);
            }
        }
        System.out.println(" max key"+key+" count"+max);
        System.out.println(list);

    }

}