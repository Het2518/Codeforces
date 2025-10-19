import java.util.*;

public class BeautifulXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                // No operations needed
                System.out.println(0);
            } else {
                long target = a ^ b;

                if (target <= a) {
                    // 1 operation is enough
                    System.out.println(1);
                    System.out.println(target);
                } else {
                    // 2 operations check
                    // Pick x = a, y = target ^ a
                    long x = a;
                    long y = target ^ a;

                    if (y <= (a ^ x)) {  // intermediate must allow y
                        System.out.println(2);
                        System.out.println(x + " " + y);
                    } else {
                        // Not possible
                        System.out.println(-1);
                    }
                }
            }
        }

        sc.close();
    }
}
