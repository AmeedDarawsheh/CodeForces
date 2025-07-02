import java.math.BigInteger;
import java.util.Scanner;

public class Codeforces_2093C {


    static boolean isPrime(BigInteger number) {

        return number.isProbablePrime(10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();


            String xStr = String.valueOf(x);
            StringBuilder yStr = new StringBuilder();
            for (int i = 0; i < k; i++) {
                yStr.append(xStr);
            }


            BigInteger y = new BigInteger(yStr.toString());


            if (isPrime(y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}