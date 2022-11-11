import java.util.Scanner;

public class monthCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        long ss = 1;
        ss++;
        System.out.println(ss);
        System.out.println("a");

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("THE NUMBER OF DAYS ARE 31");
                break;
            case 2:
                System.out.println("THE NUMBER OF DASY ARE 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("THE NUMBER OF DAYS ARE 30");
                break;
                              System.out.println("Karan changes");

        }
    }
}
