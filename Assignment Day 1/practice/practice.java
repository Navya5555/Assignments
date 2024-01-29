import java.util.Scanner;
public class practice {
    public static void main(String[] args){
            Scanner convert=new Scanner(System.in);
            System.out.println("Finding even or odd");
            int number = convert.nextInt();
           String  result = (number == 4) ? "Even number" : "Odd number";
            System.out.println(result);
        }
    }

