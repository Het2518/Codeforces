import java.util.Scanner;

public class Translation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();

    if (new StringBuilder(s).reverse().toString().equals(t)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
