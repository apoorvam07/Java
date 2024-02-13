import java.util.Scanner;

public class Primenumber {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
      int n=  input.nextInt();
      
      boolean isPrime=true;

      for (int index = 2; index <=n-1; index++) {
        if(n %index==0 ){
          isPrime=false;
          break;
        }
      }
      System.out.println(isPrime);
  input.close();
}
}