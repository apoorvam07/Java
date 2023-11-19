import java.util.Scanner;

public class Switch {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

//        String userInput= input.nextLine();
//        switch(userInput) {
//            case "1":
//                System.out.printf("%d%n", a);
//                break;
//            case "2":
//                System.out.printf("%d%n", a + 1);
//                break;
//            case "3":
//                System.out.printf("%d%n", a + 2);
//                break;
//            default:
//                System.out.printf("%d%n", 100);
//                break;
//        }

//            better way to write alt+enter
            int weekend = input.nextInt();
            switch (weekend){
                case 1 ,2,3, 4,5  -> System.out.println("weekdays");
                case 6 ,7-> System.out.println("weekend");
            }
            String flower = input.next();
            switch (flower) {
                case "lotus":
                    System.out.println("wow");
                    break;
                case "lilly":
                    System.out.println("beauty");
                    break;
                case "rose":
                    System.out.println("cool");
                    break;
                default:
                    System.out.println("all are beautiful");
            }
        }

}
