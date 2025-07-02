import java.io.*;
import java.util.*;

public class Solution {
    static final int MAXV = 100_000;
    static int[] spf = new int[MAXV+1];
    static ArrayList<Integer>[] posList = new ArrayList[MAXV+1];

    // build smallest‐prime‐factor table once
    static {
        for (int i = 0; i <= MAXV; i++) spf[i] = 0;
        for (int p = 2; p <= MAXV; p++) {
            if (spf[p] == 0) {
                for (int j = p; j <= MAXV; j += p) {
                    if (spf[j] == 0) spf[j] = p;
                }
            }
        }
        // prepare the buckets
        for (int i = 0; i <= MAXV; i++) posList[i] = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt(), q = in.nextInt();
            int[] a = new int[n+1];
            List<Integer> used = new ArrayList<>();

            // read a[i] and record positions
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                if (posList[a[i]].isEmpty()) used.add(a[i]);
                posList[a[i]].add(i);
            }

            // answer queries
            while (q-- > 0) {
                int k0 = in.nextInt(), L = in.nextInt(), R = in.nextInt();
                long ans = 0;
                int cur = k0, pos = L;

                // factor k0 and enumerate its divisors
                List<Integer> divs = getDivisors(k0);

                // jump to each next index where a[i] | cur
                while (pos <= R) {
                    int nextPos = R+1, bestD = -1;

                    for (int d : divs) {
                        if (d > 1 && cur % d == 0) {
                            ArrayList<Integer> lst = posList[d];
                            if (lst.isEmpty()) continue;
                            // lower_bound for pos
                            int idx = Collections.binarySearch(lst, pos);
                            if (idx < 0) idx = -idx - 1;
                            if (idx < lst.size() && lst.get(idx) < nextPos) {
                                nextPos = lst.get(idx);
                                bestD = d;
                            }
                        }
                    }

                    // no more divisions possible in [pos..R]
                    if (bestD < 0) {
                        ans += (long)(R - pos + 1) * cur;
                        break;
                    }

                    // add cur for all positions before nextPos
                    ans += (long)(nextPos - pos) * cur;

                    // at nextPos divide cur by bestD repeatedly
                    while (cur % bestD == 0) cur /= bestD;
                    ans += cur;

                    pos = nextPos + 1;
                }

                out.println(ans);
            }

            // clear for next test
            for (int v : used) posList[v].clear();
        }

        out.flush();
    }

    // factor via spf[] and build all divisors
    static List<Integer> getDivisors(int x) {
        List<Integer> ds = new ArrayList<>();
        ds.add(1);
        while (x > 1) {
            int p = spf[x], cnt = 0;
            while (x % p == 0) { x /= p; cnt++; }
            int sz = ds.size(), mul = 1;
            for (int e = 1; e <= cnt; e++) {
                mul *= p;
                for (int i = 0; i < sz; i++) {
                    ds.add(ds.get(i) * mul);
                }
            }
        }
        return ds;
    }

    // fast input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }
}