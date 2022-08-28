public class Factorial {

    public static void main(String[] args) {
        var a = factorial(3);
        System.out.println(a);
    }

    public static int factorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
