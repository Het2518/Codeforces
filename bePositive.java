import java.util.Scanner;

public class bePositive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalTestCases = sc.nextInt();

    while(totalTestCases-- > 0) {
      int numberOfTestCases = sc.nextInt();
      int[] testCases = new int[numberOfTestCases];

      int zeros = 0;
      int negatives = 0;

      for (int i = 0; i < numberOfTestCases; i++) {
        testCases[i] = sc.nextInt();
        if (testCases[i] == 0) {
          zeros++;
        } else if (testCases[i] == -1) {
          negatives++;
        }
      }

      int operations = zeros;

      if (negatives % 2 == 1) {
        operations += 2;
      }

      System.out.println(operations);
    }
    sc.close();
  }
}
