import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            // Count of 1-bits at each position across all a[j]
            int[] cnt1 = new int[30];
            for (int x : a) {
                for (int b = 0; b < 30; b++) {
                    if (((x >> b) & 1) == 1) {
                        cnt1[b]++;
                    }
                }
            }

            long best = 0;
            // For each k, compute sum_j (a[k] xor a[j])
            for (int x : a) {
                long sum = 0;
                for (int b = 0; b < 30; b++) {
                    long bitValue = 1L << b;
                    if (((x >> b) & 1) == 1) {
                        // a_k has bit b = 1, contributes 1 for each a_j with bit b = 0
                        sum += bitValue * (n - cnt1[b]);
                    } else {
                        // a_k has bit b = 0, contributes 1 for each a_j with bit b = 1
                        sum += bitValue * cnt1[b];
                    }
                }
                if (sum > best) {
                    best = sum;
                }
            }

            out.println(best);
        }

        out.flush();
        out.close();
    }

    // Fast input reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}