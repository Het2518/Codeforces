import java.util.Scanner;

public class BoyorGirl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int uniqueChars = (int) name.chars().distinct().count();
    if (uniqueChars % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}
