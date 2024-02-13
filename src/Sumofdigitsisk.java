import java.util.Scanner;

public class Sumofdigitsisk {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
      int R=  input.nextInt();
      int K=  input.nextInt();
     
      for(int N=1;N<=R;++N ){ 
        int sum=0; 
      for(int num=N;num>0;num/=10 ){
        int lastdigit=num%10;
        sum+=lastdigit;


  }
  if(sum==K)

  System.out.println("Sum of digits in "+ N+" is " + sum);
  input.close();
}
}}