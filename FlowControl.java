import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("It gives first value");
        int a = temp.nextInt();
        System.out.println("It gives the second value");
        int b = temp.nextInt();


        int number= temp.nextInt();
        if (number > 100) {
            System.out.println("Given number is greater than 100");

        }

        int salary = temp.nextInt();
        if (salary > 50000){
            System.out.println("Your salary per Month ");
        }
        else{
            System.out.println("Your salary is not Matching");
        }
    }
}
