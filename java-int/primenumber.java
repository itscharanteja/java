import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        int low = 1, high;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range u want to find the prime numbers");
        high = sc.nextInt();

        while (low < high) {
            boolean flag = false;
            for (int i = 2; i <= low / 2; ++i) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(low + " ");
            ++low;
        }
    }
}