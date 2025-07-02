import java.util.*;

public class Codeforces_2094C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];

            // Read the grid
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }


            int[] perm = new int[2 * n + 1]; 
            boolean[] used = new boolean[2 * n + 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int k = (i + 1) + (j + 1); 
                    if (k >= 2 && k <= 2 * n) {
                        perm[k] = grid[i][j];
                        used[grid[i][j]] = true;
                    }
                }
            }

            for (int num = 1; num <= 2 * n; num++) {
                if (!used[num]) {
                    perm[1] = num;
                    break;
                }
            }
            for (int k = 1; k <= 2 * n; k++) {
                System.out.print(perm[k] + " ");
            }
            System.out.println();
        }
    }
}