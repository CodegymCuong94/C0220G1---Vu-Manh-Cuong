package Views;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DisplayMainMenu();
    }

    public static void DisplayMainMenu() {
        System.out.println("Choose your number:\n" +
                "1. Add New Student.\n" +
                "2. Show Information Student. \n" +
                "3. Exit.");
        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addNewStudent();
                break;
            case "2":
                showInformationStudent();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Fail.Enter to Continue ");
                sc.nextLine();
                DisplayMainMenu();
        }
    }

    private static void showInformationStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show information. Enter to continue");
        sc.nextLine();
        DisplayMainMenu();
    }

    private static void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add new student complete. Enter to continue");
        sc.nextLine();
        DisplayMainMenu();

    }
}
