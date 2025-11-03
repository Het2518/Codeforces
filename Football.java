import java.util.Scanner;

public class Football {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int one = 0;
    int zero = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        one++;
        zero = 0;
      } else {
        zero++;
        one = 0;
      }
      if (one >= 7 || zero >= 7) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
