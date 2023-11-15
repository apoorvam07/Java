// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Strings {
    public static void main(String[] args) {

        String name="apoo";


        String fame="search";
String game= fame+name;
        System.out.println(fame.length());
        System.out.println(game.length());
        System.out.println(game.charAt(9));

        String c= game.replace( 'a', 'b');
        System.out.println(game);
        System.out.println(c);
        System.out.println(name.substring(1,3));
String d=name.substring(1,3);
        System.out.println(d);
    }
}