import java.util.Scanner;

public class SoldierAndBananas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int n = scanner.nextInt();
    int w = scanner.nextInt();
    int totalCost = k * w * (w + 1) / 2;
    int need = totalCost - n;
    if (need < 0) {
      need = 0;
    }
    System.out.println(need);
  }
}
