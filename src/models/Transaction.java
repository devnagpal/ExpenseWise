package models;
import java.time.LocalDate;
public class Transaction{
    private String description;
    private double amount;
    private Category category;
    private LocalDate date;
    private boolean isIncome;
    public Transaction(String description,double amount,Category category,boolean isIncome){
        this.description=description;
        this.amount=amount;
        this.category=category;
        this.isIncome=isIncome;
        this.date=LocalDate.now();
    }
    public Transaction(String description,double amount,Category category,boolean isIncome,LocalDate date){
        this.description=description;
        this.amount=amount;
        this.category=category;
        this.isIncome=isIncome;
        this.date=date;
    }
    public double getAmount(){
        return amount;
    }
    public boolean isIncome(){
        return isIncome;
    }
    public Category getCategory(){
        return category;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getDate(){
        return date;
    }
    @Override
    public String toString(){
        String type = isIncome ? "+ Income" : "- Expense";
        return String.format("[%s] %s | %s: $%.2f",date.toString(),type,category.name(),amount);
    }
}