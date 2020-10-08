import java.util.Scanner;

public class Main {

    public static int squareOfSum(int number) {
        int corollary = 0;
        corollary = (number * (number+1)) / 2;
        return corollary*corollary;
    }

    public static int sumOfSquares(int number) {
        int corollary = 0;
        for (int i = 1; i <= 100; i++) {
            corollary += i*i;
        }
        return corollary;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the number : ");
	int number = in.nextInt();

	int squareOfSum = squareOfSum(number);
	int sumOfSquares = sumOfSquares(number);

	System.out.println("Answer = " + (squareOfSum - sumOfSquares));
    }
}
