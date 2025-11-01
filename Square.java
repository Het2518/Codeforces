import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d;

    int testCases = sc.nextInt();
    for (int i = 0; i < testCases; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();

      if (a == b && b == c && c == d) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
