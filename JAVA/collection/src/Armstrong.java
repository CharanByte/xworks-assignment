import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
       boolean a= armstrong(n);
        System.out.println(a);
    }
    public static boolean armstrong(int n){

        int count=0,sum=0,orinal=n,s=n;
        while (n!=0){
            count++;
            n/=10;
        }
        System.out.println(count);
       
        while (s!=0){
            int last=s%10;
            sum= (int) (sum+Math.pow(last,count));
            s/=10;
        }
        System.out.println(sum);
        return sum==orinal;
    }
}
