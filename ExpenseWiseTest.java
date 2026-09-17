import models.Category;
import models.Transaction;
import models.User;
import exceptions.InvalidTransactionException;
public class ExpenseWiseTest{
    public static void main(String[] args){
        System.out.println("--- Running Tests ---");
        testUserCreation();
        testTransactionData();
        System.out.println("--- All Tests Finished ---");
    }
    private static void testUserCreation(){
        User user=new User("Student",5000.0,0.0);
        if(user.getMonthlyBudget()==5000.0 && user.getUsername().equals("Student")){
            System.out.println("PASS: User creation successful.");
        }else{
            System.out.println("FAIL: User creation failed.");
        }
    }
    private static void testTransactionData(){
        Transaction t=new Transaction("Snacks",50.0,Category.FOOD,false);
        if(t.getAmount()==50.0 && !t.isIncome() && t.getCategory()==Category.FOOD){
            System.out.println("PASS: Transaction data binding successful.");
        }else{
            System.out.println("FAIL: Transaction data binding failed.");
        }
    }
}
