import java.util.Arrays;

public class methodoverloading {
    public static void main(String[] args) {
        fun(2,3,4,5,6);
        fun("b",2,3,4,5,6);

    }

    static   void fun(int  ...v) {
        System.out.println(Arrays.toString(v));
    }
    static   void fun(String a, int b,  int ...v) {
        System.out.println(a +b);
        System.out.println(Arrays.toString(v));
    }
}