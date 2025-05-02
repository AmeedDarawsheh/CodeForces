import java.util.*;

public class Main {

    static final int N = 1 << 21;
    static final int MOD = (int) 1e9 + 7;
    static int[] a = new int[N], ma = new int[N];
    static int n, len;
    static ModInt[] dp = new ModInt[N];

    static class ModInt {
        int x;

        ModInt(int x) {
            this.x = (x % MOD + MOD) % MOD;
        }

        ModInt add(ModInt o) {
            return new ModInt((x + o.x) % MOD);
        }

        ModInt sub(ModInt o) {
            return new ModInt((x - o.x + MOD) % MOD);
        }

        ModInt mul(ModInt o) {
            return new ModInt((int) ((1L * x * o.x) % MOD));
        }

        ModInt pow(int b) {
            ModInt res = new ModInt(1);
            ModInt base = new ModInt(x);
            while (b > 0) {
                if ((b & 1) == 1) res = res.mul(base);
                base = base.mul(base);
                b >>= 1;
            }
            return res;
        }

        ModInt inv() {
            return pow(MOD - 2);
        }

        ModInt div(ModInt o) {
            return mul(o.inv());
        }
    }

    static class StackHelper {
        int[] stk = new int[N];
        int top = 0;
        ModInt sum = new ModInt(0);

        ModInt inc(int i) {
            while (top > 0 && ma[i] >= ma[stk[top]]) {
                --top;
                if (top > 0) {
                    ModInt delta = new ModInt(ma[stk[top]] - ma[stk[top + 1]]);
                    sum = sum.sub(delta.mul(dp[stk[top]]));
                }
            }
            stk[++top] = i;
            if (top > 1) {
                ModInt delta = new ModInt(ma[stk[top - 1]] - ma[stk[top]]);
                sum = sum.add(delta.mul(dp[stk[top - 1]]));
            }
            return sum;
        }
    }

    static StackHelper[] ds = { new StackHelper(), new StackHelper() };

    static void solve(Scanner sc) {
        int length = sc.nextInt();
        String s = new StringBuilder(sc.next()).reverse().toString();

        boolean same = true;
        for (int i = 0; i < s.length(); i++) {
            same &= s.charAt(i) == s.charAt(0);
        }

        if (same) {
            System.out.println(s.length() - 1);
            return;
        }

        n = 0;
        len = 0;

        for (int i = 0; i < s.length(); i++) {
            ++len;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                a[++n] = len;
                len = 0;
            }
        }

        for (int i = 0; i <= n; i++) dp[i] = new ModInt(0);

        for (int i = 1; i < n; i++) {
            if ((n - i) % 2 == 0) {
                dp[i] = new ModInt((n - i) / 2);
            } else {
                dp[i] = new ModInt(a[n] + (n - i) / 2);
            }
        }

        for (int i = 1; i <= n; i++) {
            ma[i] = a[i] + i / 2;
        }

        ds[0].top = 0;
        ds[0].sum = new ModInt(0);
        ds[1].top = 0;
        ds[1].sum = new ModInt(0);

        for (int i = n; i >= 2; i--) {
            dp[i - 1] = dp[i - 1].add(new ModInt(a[i]).mul(dp[i]));
            dp[i - 1] = dp[i - 1].add(ds[i % 2].inc(i));
        }

        System.out.println(dp[1].mul(new ModInt(a[1])).x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}