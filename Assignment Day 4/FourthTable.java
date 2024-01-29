import java.util.Scanner;

public class FourthTable {

    public static void multiplyingTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+number*i);

        }
    }
    public static void main(String[] args){
        Scanner table = new Scanner(System.in);
        int number =table.nextInt();
        multiplyingTable(number);

    }
}
