import java.util.Scanner;

public class Expression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] results = new int[4];
        results[0] = x + y + z;
        results[1] = x * y * z;
        results[2] = (x + y) * z;
        results[3] = x * (y + z);

        int max_result = results[0];
        for (int i = 1; i < 4; i++) {
            if (results[i] > max_result) {
                max_result = results[i];
            }
        }
        System.out.println(max_result);
    }
}
