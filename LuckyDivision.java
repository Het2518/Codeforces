import java.util.Scanner;

public class LuckyDivision {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] lucky_array = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
    int n = sc.nextInt();

    for (int i = 0; i < lucky_array.length; i++) {
      if (n % lucky_array[i] == 0) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
