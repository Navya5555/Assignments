import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next().toUpperCase();

        int changing = changingToInteger(temp);

        if (changing != -1) {
            System.out.println("The number " + temp + " is " + changing);

        } else {
            System.out.println("Invalid Roman number.");
        }
    }

    private static int changingToInteger(String temp) {
        int changing = 0;
        for (int i = 0; i < temp.length(); i++) {
            int currentValue = getValue(temp.charAt(i));

            if (i + 1 < temp.length()) {
                int numberValue = getValue(temp.charAt(i + 1));

            if (currentValue >= numberValue) {
                changing += currentValue;
            } else {
                changing += (numberValue - currentValue);
                i++;
            }}else {
                changing += currentValue;
            }

        }
        return changing;
    }

    private static int getValue(char number) {
        switch (number) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
            return 100;
            default:
                return -1;
        }
    }

}