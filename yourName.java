import java.util.*;

public class yourName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();

    while (q-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      String t = sc.next();

      char[] sarr = s.toCharArray();
      char[] tarr = t.toCharArray();
      Arrays.sort(sarr);
      Arrays.sort(tarr);

      if (Arrays.equals(sarr, tarr)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    sc.close();
  }
}
