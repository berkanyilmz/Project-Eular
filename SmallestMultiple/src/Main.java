public class Main {

    public static boolean canDivided(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void smallestMultiple() {
        int number = 3000;

        while (true) {
            if (canDivided(number)) {
                break;
            }
            number++;
        }
        System.out.println("Smallest multiple = " + number);
    }

    public static void main(String[] args) {
        smallestMultiple();
    }
}
