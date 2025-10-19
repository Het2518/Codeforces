import java.util.Scanner;

public class Bitland {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cases = sc.nextInt();
    sc.nextLine();

    int base = 0;

    while (cases-- > 0) {
      String str = sc.nextLine();

      switch (str) {
        case "X++" -> base++;
        case "X--" -> base--;
        case "++X" -> ++base;
        case "--X" -> --base;
        default -> {
        }
      }
    }
    System.out.println(base);
    sc.close();
  }
}
