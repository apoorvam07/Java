import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        int a = 3;
        Scanner input = new Scanner(System.in);
        int b= input.nextInt();

        b = (b > 2) ? a : (a - 1);
        System.out.println(b);

        if (b > 2) {
            System.out.printf("%d%n", a);
        } else if (b < 2) {
            System.out.printf("%d%n", a-1);
        }
//
    }
}
