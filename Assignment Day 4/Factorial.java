import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int num = temp.nextInt();

        long factorial = CalculatingFactorialOf(num);
        System.out.println("Factorial of" + num + "is" + factorial);
    }

    private static long CalculatingFactorialOf(int number) {
        if (number < 0) {
            return -1;
        }
        long result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
            return result;


        }
    }



