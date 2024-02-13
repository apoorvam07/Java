import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int prime= input.nextInt();
        boolean ans= isPrime(prime);
        System.out.println( ans);
        input.close();
    }

    static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){      //n=5(4<=5)
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c * c <= n;   //4
        
    }
    
}
