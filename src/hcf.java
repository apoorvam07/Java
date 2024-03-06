import java.util.Scanner;

public class hcf {
  
 public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    int a=  input.nextInt();
    int b=  input.nextInt();
    int hcf;
    for(int i=1;i<=a || i<=b;i++){
      if(a%i==0 && b%i==0){//check code
          hcf=i;      
      System.out.println(hcf);
    }}
 
   
  input.close();
  }

}
