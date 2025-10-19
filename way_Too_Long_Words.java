import java.util.Scanner;

public class way_Too_Long_Words {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lines = sc.nextInt();
    sc.nextLine();

    while(lines-- > 0){
      String str = sc.nextLine();

      if(str.length() > 10){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        sb.append(str.length() - 2);
        sb.append(str.charAt(str.length() - 1));
        System.out.println(sb.toString());
      } else {
        System.out.println(str);
      }
    }
  }
}
