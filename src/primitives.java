import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        Scanner bd = new Scanner(System.in);
        String x = bd.next();
        System.out.println(x);

        int f=257;
        byte g= (byte) f;
        float e=4.3f;
        System.out.println(e);
        System.out.println(g);
        double sd=3.3;
        float d= (float)sd;
        System.out.println(d);

        String  name= bd.next();
        System.out.println(name);

        // typecasting
        int num = (int)(78.9);
        System.out.println(num);

        //automatic type promotion

        int a=257;
        byte b=(byte) (a);
        System.out.println(b);

        bd.close();

    }
}