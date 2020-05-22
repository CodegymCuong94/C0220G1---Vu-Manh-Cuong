import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw the triangle");
        System.out.println("2.Draw the square");
        System.out.println("3.Draw the rectangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                break;
            case 3:
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice");

        }
    }
}
