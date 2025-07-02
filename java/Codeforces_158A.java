import java.util.Scanner;

public class Codeforces_158A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), count = 0;
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) scores[i] = in.nextInt();

        for (int score : scores) 
            if (score >= scores[k - 1] && score > 0) count++;

        System.out.println(count);
    }
}