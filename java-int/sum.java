import java.util.StringTokenizer;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println("Integer: " + num);
            sum += num;
        }

        System.out.println("Sum of all integers: " + sum);
    }
}