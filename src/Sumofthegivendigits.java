import java.util.Scanner;

  public class Sumofthegivendigits {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      int n=  input.nextInt();
      
      int sum=0;
      for(int num=n;num>0;num/=10 ){
        int lastdigit=num%10;
        sum+=lastdigit;
      }
      System.out.println("Sum of digits in "+n+" is " + sum);
        input.close();
    }}
  