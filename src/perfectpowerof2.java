import java.util.Scanner;
public class perfectpowerof2 {
 public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    int N=  input.nextInt();

    while(N%2==0)
    N/=2;
    if(N==1){
  System.out.println(true);
  }else{
  System.out.println(false);
  }  
  
  input.close();
  }

}
