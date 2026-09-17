import java.util.Scanner;
import models.Transaction;
import models.Category;
import models.User;
import services.TransactionManager;
import exceptions.InvalidTransactionException;
public class ExpenseWiseApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TransactionManager manager=new TransactionManager();
        User user=new User("Student",1000.0,0.0);
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
                    try{
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
                    }catch(NumberFormatException e){
                        System.out.println("Error: Please enter a valid number for amount.");
                    }catch(IllegalArgumentException e){
                        System.out.println("Error: Invalid category. Please use a provided category.");
                    }catch(InvalidTransactionException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("--- All Transactions ---");
                    manager.viewAll();
                    break;
                case "3":
                    manager.printSummary(user);
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