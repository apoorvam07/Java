import java.util.Scanner;

public class squarepattern {
 public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    int a=  input.nextInt();
    
    for (int n=1;n<=a;++n){
        for (int p=1;p<=a;++p)
          System.out.print("*");
            System.out.println("");
         
  }
  input.close();
  }

}
