import java.util.Scanner;
public class ExpenseWiseApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running=true;
        System.out.println("     Welcome to ExpenseWise!     ");
        while (running){
            System.out.println("\nMain Menu:");
            System.out.println("1. Add a Transaction (Income/Expense)");
            System.out.println("2. View All Transactions");
            System.out.println("3. View Budget Summary");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Adding transactions!");
                    break;
                case "2":
                    System.out.println("Viewing history!");
                    break;
                case "3":
                    System.out.println("Summary and budget checking!");
                    break;
                case "4":
                    System.out.println("Exiting. See you next time!");
                    running=false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number from 1 to 4.");
            }
        }
        scanner.close();
    }
}