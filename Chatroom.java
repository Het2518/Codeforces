import java.util.Scanner;

public class Chatroom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String target = "hello";
    int idx = 0;

    for (int i = 0; i < s.length() && idx < target.length(); i++) {
      if (s.charAt(i) == target.charAt(idx)) {
        idx++;
      }
    }

    if (idx == target.length()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }
}
