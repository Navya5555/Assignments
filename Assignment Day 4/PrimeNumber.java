import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        prime(number);

        if (prime(number)) {
            System.out.println(number + " is prime Number");
        } else {
            System.out.println(number + "is not prime Number");
        }
    }

        private static boolean prime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
                return true;
            }
        }



