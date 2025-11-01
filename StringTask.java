import java.util.Scanner;

public class StringTask {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'A' || c == 'a' || c == 'E' || c == 'e' ||
          c == 'I' || c == 'i' || c == 'O' || c == 'o' ||
          c == 'U' || c == 'u' || c == 'Y' || c == 'y') {
      } else {
        result += "." + Character.toLowerCase(c);
      }
    }

    System.out.println(result);
    sc.close();
  }
}
