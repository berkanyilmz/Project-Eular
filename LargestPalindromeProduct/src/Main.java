public class Main {

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int i, j;


        for (i = 0, j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void largestPalindromeProduct() {
        int product = 1;
        int firstMultipler = 1;
        int secondMultipler = 1;
        for (int i = 999; i > 100; i--) {
                for (int j = 999; j > 100 ; j--) {
                        if (isPalindrome(i*j)) {
                            if ((i*j) > product) {
                                firstMultipler = i;
                                secondMultipler = j;
                                product = i*j;
                            }
                        }
                }
        }
        System.out.println("First Product = " + firstMultipler);
        System.out.println("Second Product = " + secondMultipler);
        System.out.println("The largest palindrome product = " + product);
    }

    public static void main(String[] args) {
        largestPalindromeProduct();
    }
}
