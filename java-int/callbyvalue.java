public class callbyvalue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swapping in the main a=" + a + " b=" + b);
        swap_function(a, b);
        System.out.println("after swapping in the main a=" + a + " b=" + b);

    }

    public static void swap_function(int a, int b)

    {
        int c = a;
        a = b;
        b = c;

        System.out.println("after swappin in the swap a=" + a + " b=" + b);

    }
}