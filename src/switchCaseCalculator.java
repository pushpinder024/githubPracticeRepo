import java.sql.SQLOutput;
import java.util.Scanner;

public class switchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE FIRST NUMBER");
        int A = sc.nextInt();
        System.out.println("PLEASE ENTER THE SECOND NUMBER");
        int B = sc.nextInt();

        System.out.println("ENTER THE OPERATION TYPE TO BE EXECUTED: -, +, *, /.");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(A + B);
                break;

            case '-':
                System.out.println(A - B);
                break;

            case '*':
                System.out.println(A * B);
                break;

            case '/':
                System.out.println(A / B);
                break;

            default:
                System.out.println("INVALID ENTRY");
        }
    }
}
