import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int end=scanner.nextInt();
        for (int i=first;i<end;i++) {
            boolean value = isPrime(i);
            if (value == true) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
