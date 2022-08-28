public class SumOfDigits {

    public static void main(String[] args) {
        var a = sumOfDigits(55);
        System.out.println(a);
    }

    public static int sumOfDigits(int n) {

        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }
}
