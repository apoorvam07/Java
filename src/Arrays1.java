import java.util.Arrays;


public class Arrays1 {
    public static void main(String[] args) {
        int[] ar=new int[5]; 
        ar[1]=6;
        ar[2]=5;
        ar[3]=3;
        for(int i:ar)
        System.out.println(i);

        int[] a = {1, 2, 3};
        System.out.println(a[1]);
        System.out.println(a[2]);
      //toString
      System.out.println(Arrays.toString(a));
      //sort
      Arrays.sort(ar);
      System.out.println(Arrays.toString(a));
      //fill()
      Arrays.fill(ar,1);
      System.out.println(Arrays.toString(ar));


      int arr1[]={1,2,3};
      //compare
      int arr2[]=arr1;
      System.out.println(Arrays.toString(arr2));
      arr1[1]=5;
      System.out.println(Arrays.toString(arr2));

      System.out.println(Arrays.toString(arr1));
      arr2[1]=6;
      System.out.println(Arrays.toString(arr1));

    //equals
      System.out.println(Arrays.equals(arr1,arr2));
    //copyOf
      int arr3[]=Arrays.copyOf(arr1,arr1.length);
      System.out.println(Arrays.toString(arr3));

    
    }
}