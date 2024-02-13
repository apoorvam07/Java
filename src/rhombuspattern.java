import java.util.Scanner;

public class rhombuspattern {
public static void main(String[] args) {
  
Scanner input=new Scanner(System.in);
int a=  input.nextInt();
      
for (int row=1;row<=a;++row){
  for (int space=1;space<=(row-1);++space)
  System.out.print(" ");
    for (int p=1;p<=a;++p)
        System.out.print("*");
          System.out.println("");
        }




    input.close();
    }
  
  }