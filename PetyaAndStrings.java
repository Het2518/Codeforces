import java.util.Scanner;

public class PetyaAndStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine().toLowerCase();
    String str2 = sc.nextLine().toLowerCase();

    int comp = str1.compareTo(str2);
    if (comp < 0) {
      System.out.println(-1);
    } else if (comp > 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
