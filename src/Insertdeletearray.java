import java.util.Scanner;

public class Insertdeletearray {

public static void display(int ar[],int N) {
  for (int i = 0; i < N; i++) {
    System.out.println(ar[i]);
  	}
}

public static int insert_at_end(int ar[],int N,int val) {
  if(N<ar.length){
    ar[N]=val;
    return N+1;
    }return N;
}

public static int delete_at_end(int ar[],int N) {
  if(N>=1){
    ar[N-1]=0;
    return N-1;
    }return N;
}

public static int insert(int ar[],int N,int val) {
  if(N>=0){
    ar[N+1]=ar[N];
    N++;
    ar[N]=val;
    return N;
    }return N-1;
}

public static int delete(int ar[],int N) {
  if(N>=0){
    ar[N]=ar[N+1];
    return N;
    }return N-1;
    
}


  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    int N=input.nextInt();
    int ar[]=new int[100];

    //input the array  
    for (int i = 0; i < N; i++) {
    ar[i]=input.nextInt();
    }
    //insert the number
    System.out.println("Enter the index to insert");
    int num_place=input.nextInt();
    
    System.out.println("Enter the num to insert");
    int num=input.nextInt();

  	if(ar[num_place]!=0){
  	ar[num_place]=ar[num_place+1];
  	ar[num_place]=num;
  	num_place++;
  	}
  	else if(ar[num_place]==0){
    ar[num_place]=num;
  	}
    display(ar, N);
  	
    System.out.println("delete_at_end");
    N=delete_at_end(ar, N);
    display(ar, N);

    System.out.println("insert_at_end");
    N=insert_at_end(ar, N,3);
    N=insert_at_end(ar, N,5);
    N=insert(ar, 1,5);
    
    display(ar, N);
    
    input.close();
  }
  
}
