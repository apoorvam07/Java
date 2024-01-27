import java.util.Scanner;
public class fizzbuzz{
public static void main(String[] args) {
  //break,continue,for
  Scanner input=new Scanner(System.in);
  int n=  input.nextInt();
 
int sum =0;
  for(int i=1;i<=n;i++){
    if(i%4==0)
    continue;
    if(i%5==0 && i%3==0){
      System.out.println("fizzbuzz");
    }
    else if ((i%3==0)) {
      System.out.println("fizz");
    }
      else if(i%5==0){
        System.out.println("buzz"); 
      } else {
        System.out.println(i); 
        sum+=i;
        System.out.println("sum is "+sum);
      }
      if (sum>3*n){
        break;
      }
    }
    input.close();
}}