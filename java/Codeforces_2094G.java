import java.io.*;
import java.util.*;

public class Codeforces_2094G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int q = Integer.parseInt(br.readLine().trim());
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            long S = 0;           // sum of elements
            long R = 0;           // rizziness
            boolean rev = false;  // logical reversal flag
            
            for (int i = 0; i < q; i++) {
                tok = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(tok.nextToken());
                
                if (s == 1) {
                    // cyclic shift right by 1
                    int n = dq.size();
                    // extract the element at old index n:
                    int x = rev ? dq.removeFirst() : dq.removeLast();
                    // place it at front of current array:
                    if (rev) dq.addLast(x);
                    else     dq.addFirst(x);
                    // update rizziness
                    R += S - (long)n * x;
                    
                } else if (s == 2) {
                    // reverse the array
                    int n = dq.size();
                    R = S * (n + 1L) - R;
                    rev = !rev;
                    
                } else { // s == 3, append k
                    int k = Integer.parseInt(tok.nextToken());
                    int n = dq.size();
                    S += k;
                    R += (long)k * (n + 1);
                    // append to end of current array:
                    if (rev) dq.addFirst(k);
                    else     dq.addLast(k);
                }
                
                out.append(R).append('\n');
            }
        }
        
        System.out.print(out);
    }
}