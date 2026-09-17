package models;
public class User{
    private String username;
    private double monthlyBudget;
    private double currentBalance;
    public User(String username,double monthlyBudget,double startingBalance){
        this.username=username;
        this.monthlyBudget=monthlyBudget;
        this.currentBalance=startingBalance;
    }
    public String getUsername(){
        return username;
    }
    public double getMonthlyBudget(){
        return monthlyBudget;
    }
    public double getCurrentBalance(){
        return currentBalance;
    }
    public void updateBalance(double amount){
        this.currentBalance+=amount;
    }
}