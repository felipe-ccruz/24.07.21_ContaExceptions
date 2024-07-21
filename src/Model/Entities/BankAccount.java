package Model.Entities;

public class BankAccount {
    private int id;
    private String holder;
    private double balance;
    private double withdrawLimit; 
    public BankAccount(int id, String holder, double balance, double withdrawLimit) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // METODS
    public void deposit(double amount) {

    }

    public void withdraw(double amount){
        
    }


    // GETTER & SETTER
    public int getId() {
        return id;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
}
