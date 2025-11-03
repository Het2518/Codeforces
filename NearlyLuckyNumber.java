import java.util.Scanner;

public class NearlyLuckyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    int luckyDigitCount = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '4' || c == '7') {
        luckyDigitCount++;
      }
    }
    if (luckyDigitCount == 4 || luckyDigitCount == 7) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
