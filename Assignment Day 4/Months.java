import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        String month = year.nextLine();
        System.out.println("Displaying Every Month By Entering the Number");

        for (int i = 1; i<=12; i++) {
            switch (i) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Unnecessary month");

            }

            System.out.println("\nThese are the Twelve Months in Year");
        }


    }
}



