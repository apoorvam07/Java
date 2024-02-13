import java.util.Scanner;

public class Sumofndigitsisk {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

      int target_count=  input.nextInt();
      int target_sum=  input.nextInt();
      int count=0,cur_num=1;

      while(count<target_count){
      int sum=0; 

      for(int num=cur_num;num>0;num/=10 ){
        sum+=(num%10);
       
      if(sum==target_sum){
      System.out.println(num);
      count++;
      }
      cur_num++;
    }
  input.close();
}
}}