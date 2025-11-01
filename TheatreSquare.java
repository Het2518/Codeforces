import java.util.Scanner;

public class TheatreSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = sc.nextInt();

    int x = (n + a - 1) / a;
    int y = (m + a - 1) / a;

    int result = x * y;
    System.out.println(result);
  }
}
