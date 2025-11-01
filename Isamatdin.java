import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Isamatdin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        StringBuilder outputBuilder = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> toys = new ArrayList<>();
            int oddCount = 0;

            for (int i = 0; i < n; i++) {
                int toyNumber = sc.nextInt();
                toys.add(toyNumber);
                if (toyNumber % 2 != 0) {
                    oddCount++;
                }
            }

            int evenCount = n - oddCount;


            if (oddCount > 0 && evenCount > 0) {
                Collections.sort(toys);
            }


            for (int i = 0; i < toys.size(); i++) {
                outputBuilder.append(toys.get(i));
                if (i < n - 1) {
                    outputBuilder.append(" ");
                }
            }
            outputBuilder.append("\n");
        }

        System.out.print(outputBuilder.toString());

        sc.close();
    }
}
