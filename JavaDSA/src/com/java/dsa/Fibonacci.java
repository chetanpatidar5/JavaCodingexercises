public class Fibonacci {
    public static void main(String[] args) {
        var a = fibonacci(0);
        System.out.println(a);
    }


    public static int fibonacci(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
