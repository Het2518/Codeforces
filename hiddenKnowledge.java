import java.util.*;
import java.io.*;

public class hiddenKnowledge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            long ans = 0;

            for (int start = 0; start < n; start++) {
                Map<Integer, Integer> freq = new HashMap<>();
                int distinct = 0;

                for (int end = start; end < n; end++) {
                    int val = a[end];
                    if (freq.getOrDefault(val, 0) == 0) {
                        distinct++;
                    }
                    freq.put(val, freq.getOrDefault(val, 0) + 1);

                    int len = end - start + 1;

                    if (len > r) break;

                    if (distinct == k && len >= l) {
                        ans++;
                    }

                    if (distinct > k) break;
                }
            }

            pw.println(ans);
        }

        pw.close();
    }
}
