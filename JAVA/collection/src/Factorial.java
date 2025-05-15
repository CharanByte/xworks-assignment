import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        //return n*factorial(n-1);
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

}
