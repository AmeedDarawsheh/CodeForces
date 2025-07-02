import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();

            int l_prime, r_prime;

            l_prime = -(m/2);
            r_prime = m - (m/2);
            while (l_prime > l + (n-m)) {
                l_prime--;
                r_prime--;
            }
            while (r_prime < r - (n-m)) {
                l_prime++;
                r_prime++;
            }
            
            System.out.println(l_prime + " " + r_prime);
        }
    }
}