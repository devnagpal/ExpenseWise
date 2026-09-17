package services;
import models.Transaction;
import models.User;
import utils.FileHandler;
import exceptions.InvalidTransactionException;
import java.util.List;
public class TransactionManager{
    private List<Transaction> transactions;
    public TransactionManager(){
        transactions=FileHandler.loadTransactions();
    }
    public void addTransaction(Transaction t) throws InvalidTransactionException{
        if(t.getAmount()<=0){
            throw new InvalidTransactionException("Amount must be greater than zero.");
        }
        transactions.add(t);
        FileHandler.saveTransactions(transactions);
    }
    public void viewAll(){
        if(transactions.isEmpty()){
            System.out.println("No transactions found.");
            return;
        }
        for(Transaction t:transactions){
            System.out.println(t.toString());
        }
    }
    public void printSummary(User user){
        double totalIncome=0;
        double totalExpense=0;
        for(Transaction t:transactions){
            if(t.isIncome()){
                totalIncome+=t.getAmount();
            }else{
                totalExpense+=t.getAmount();
            }
        }
        System.out.println("--- "+user.getUsername()+"'s Summary ---");
        System.out.println("Total Income: Rs."+totalIncome);
        System.out.println("Total Expenses: Rs."+totalExpense);
        System.out.println("Net Balance: Rs."+(totalIncome-totalExpense));
        if(totalExpense>user.getMonthlyBudget()){
            System.out.println("WARNING: You exceeded your monthly budget of Rs."+user.getMonthlyBudget()+"!");
        }else{
            System.out.println("You are within your budget of Rs."+user.getMonthlyBudget());
        }
    }
    public List<Transaction> getTransactions(){
        return transactions;
    }
}