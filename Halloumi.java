import java.util.*;

public class Halloumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
              a[i] = sc.nextInt();

            int[] sorted = a.clone();
            Arrays.sort(sorted);

            if (Arrays.equals(a, sorted) || k > 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
