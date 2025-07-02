
import java.util.Scanner;

public class Codeforces_2094A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        for (int i = 0; i < t; i++) {
            String a = in.next();
            String b = in.next();
            String c = in.next();
            System.out.println("" + a.charAt(0) + b.charAt(0) + c.charAt(0));
        }
    }
}