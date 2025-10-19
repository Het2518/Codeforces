import java.util.Scanner;

public class BeautifulAverage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }

      int m = arr[0];
      for (int i = 1; i < n; i++) {
        if (arr[i] > m) {
          m = arr[i];
        }
      }
      System.out.println(m);
    }
  }
}
