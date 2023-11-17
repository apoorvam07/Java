import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int a = 3;
        Scanner input = new Scanner(System.in);
        int b= input.nextInt();

        b = (b > 1) ? a : (a - 1);
        System.out.println(b);

        if (b > 1) {
            System.out.printf("%d%n", a);
        } else if (b < 1) {
            System.out.printf("%d%n", a-1);
        }
//
    }
}
