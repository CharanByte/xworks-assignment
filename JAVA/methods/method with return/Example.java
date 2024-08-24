import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        int [] array=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i :array){
            System.out.print(i+" ");
        }

        pro(array);
       
    }
    public static void pro(int[] array){
        int product=1;
        for(int i: array){
            product=product*i;

        }
        System.out.println(product);

    }

    
    }
    

