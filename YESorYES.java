import java.util.Scanner;

public class YESorYES {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    sc.nextLine(); 
    for (int t = 0; t < testCases; t++) {
      processTestCase(sc);
    }
  }

  private static void processTestCase(Scanner sc) {
    String s = sc.nextLine().trim();
    if (s.equalsIgnoreCase("YES")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
