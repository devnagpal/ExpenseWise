import java.util.Scanner;
import models.Transaction;
import models.Category;
import services.TransactionManager;
public class ExpenseWiseApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TransactionManager manager=new TransactionManager();
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
                    System.out.print("Enter description: ");
                    String desc=scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amt=Double.parseDouble(scanner.nextLine());
                    System.out.print("Is this income? (true/false): ");
                    boolean isInc=Boolean.parseBoolean(scanner.nextLine());
                    System.out.print("Enter category (FOOD, RENT, TRANSPORT, ENTERTAINMENT, SALARY, OTHER): ");
                    Category cat=Category.valueOf(scanner.nextLine().toUpperCase());
                    manager.addTransaction(new Transaction(desc,amt,cat,isInc));
                    System.out.println("Transaction added!");
                    break;
                case "2":
                    System.out.println("--- All Transactions ---");
                    manager.viewAll();
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