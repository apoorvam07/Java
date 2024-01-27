import java.util.Scanner;

public class totaldigits {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
    int n=  input.nextInt();
    int digits=0;
    for(int num=n;num>0;num/=10 ){
      System.out.println("number is now "+num);
      digits++; 
    }
    System.out.println("Total number of digits in "+n+" is "+digits);
      input.close();
  }}
