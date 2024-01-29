import java.util.Scanner;

public class SumofEvenOrOdd {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int sum = temp.nextInt();

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                // System.out.println("Give EvenNumbers");
                System.out.println("Even : "+i);
            } else {
                //  System.out.println("Give OddNumbers");
                System.out.println("Odd : " +i);
            }


        }
    }
}

