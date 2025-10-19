import java.util.Scanner;

public class Wrong_Subtraction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int op = sc.nextInt();
    while (op > 0) {
      if (number % 10 == 0) {
        number = number / 10;

      } else {
        number = number - 1;
      }
      op--;
    }
    System.out.println(number);
  }
}
