import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input="madam";

       Character c= repeat(input);
        System.out.println(c);

    int[] arr={1,2,3,4,5};
    int middle=getMiddle(arr);
        System.out.println(middle);

        Map<String,Long> map=new HashMap<>();
        map.put("Mars",78000L);
        map.put("Venus",41000000L);
        map.put("Jupiter",628000000L);

        String nearest=getNearest(map);
        System.out.println(nearest);

        int[] a={1,4,3,-6,-7,0};
        int pro=getProduct(a);
        System.out.println(pro);

//        Map<String,Date> map1=new HashMap<>();
//        map.put("Book",2025-02-25);
//        map.put("Venus",41000000L);
//        map.put("Jupiter",628000000L);
    }
    public static char repeat(String s){
        Map<Character,Integer> map=new HashMap<>();
    char ch = 0;
        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                ch=entry.getKey();
                return entry.getKey();
            }
        }
        return ch;
    }
    public static int getMiddle(int[] arr){
        List<Integer>  list= new ArrayList<>();
        for (int a:arr){
            list.add(a);
        }
        int mid= list.get(list.size()/2);




        return mid;
    }
    public  static String getNearest(Map<String,Long> map){

        Long  aLong=0L;
        for (Map.Entry<String,Long> entry:map.entrySet()){
            if(entry.getValue()>aLong) {
                aLong= entry.getValue();
            }
            }
        Long min=0L;
        for (Map.Entry<String,Long> entry:map.entrySet()){
            if(entry.getValue()<aLong) {
                min=entry.getValue();
                aLong= entry.getValue();
            }
        }
        System.out.println(min);
        String o="";
        for (Map.Entry<String,Long> entry:map.entrySet()) {
            if(entry.getValue()==min){
                o=entry.getKey();
            }
        }
        return o;
    }
    public static int getProduct(int[] arr){
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();

        for(int i:arr){
            list.add(i);
        }

        Collections.sort(list);
        System.out.println(list);
        int size=2;
        for (int i=0;i<2;i++){
            list1.add(list.get(i));
        }
        System.out.println(list1);
        int sum=0;

        for (int i=0;i<2;i++){
            sum=sum*list1.get(i);
        }


        return sum;
    }
}