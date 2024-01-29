import java.util.Scanner;

public class Diamondpattern {
public static void main(String[] args) {
  
Scanner input=new Scanner(System.in);
int a=  input.nextInt();
int stars=1 ;    

//rows to be printed
for (int row=1;row<=a;++row){
  for (int space=1;space<=a-row;++space)
  System.out.print(" ");
  for (int p=1;p<=stars;++p)
    System.out.print("*");
    stars+=2; 
      System.out.println("");
}
stars=2*(a-1)-1;

for (int row=a-1;row>=1;--row){
  for (int space=1;space<=a-row;++space)
  System.out.print(" ");
  for (int p=1;p<=stars;++p)
    System.out.print("*");
    stars-=2; 
      System.out.println("");
}





// int bstar;
// if (a%2==0){
//   bstar=a+1;
// }else bstar=a+2;

// for (int row=1;row<=a;++row){
//   for (int space=1;space<=a-row;++space)
 
//    for (int p=1;p<=bstar;++p){
//     System.out.print("*");}
//     bstar-=2; 
//       System.out.println("");
    
// }
    input.close();
    }
  
}
