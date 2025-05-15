import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      //  int n=scanner.nextInt();
        int first=scanner.nextInt();
        int last=scanner.nextInt();
       // fibonacci(n);
        fibonacci(first,last);

    }
    public static void fibonacci(int n){
        int a=0,b=1;
        System.out.print(a +" "+b+" ");
        for (int i=2;i<n;i++){
            int c=a+b;
//            if(c==n){
//                return;
//            }
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
    public  static  void fibonacci(int first,int last){
      int a=0,b=1;
        while (a<=last){
            if(a>=first){
                System.out.print(a+" ");
            }
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
