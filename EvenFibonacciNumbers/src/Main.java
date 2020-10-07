public class Main {

    public static void evenFibonacciNumbers () {
        int a = 1;
        int b = 2;
        int c = a+b;
        int sum = 2;
//1 2 3 5 8 13 21 34
//a b c
 // a b c
        while (c < 4000000) {
            if (c % 2 == 0) {
                sum += c;
            }
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        evenFibonacciNumbers();
    }
}
