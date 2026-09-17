package services;
import models.Transaction;
import utils.FileHandler;
import java.util.List;
public class TransactionManager{
    private List<Transaction> transactions;
    public TransactionManager(){
        transactions=FileHandler.loadTransactions();
    }
    public void addTransaction(Transaction t){
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
    public List<Transaction> getTransactions(){
        return transactions;
    }
}