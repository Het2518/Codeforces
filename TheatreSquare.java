import java.util.Scanner;

public class TheatreSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextInt();
    long m = sc.nextInt();
    long a = sc.nextInt();

    long x = (n + a - 1) / a;
    long y = (m + a - 1) / a;

    System.out.println(x * y);
  }
}
