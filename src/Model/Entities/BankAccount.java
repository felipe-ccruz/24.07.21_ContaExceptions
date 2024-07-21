package Model.Entities;

import java.util.Random;

import Model.Exceptions.ExceedsWithdrawLimitException;
import Model.Exceptions.InsufficientFundsException;

public class BankAccount {
    private int id;
    private String holder;
    private double balance;
    private double withdrawLimit; 
    public BankAccount(String holder, double balance, double withdrawLimit) {
        generateId();
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // METODS
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount){
        try {
            verifyBalance(amount);
            setBalance(getBalance() - amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds Error: " + e.getMessage());
        } catch(ExceedsWithdrawLimitException e){
            System.out.println("Limit exceeded Error: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Unexpected exception");
        }
    }

    public void generateId(){
        Random rand = new Random();
        setId(rand.nextInt(9000) + 1000);
    }

    // EXCEPTIONS
    public void verifyBalance(double amount) throws Exception{
        if(amount > getWithdrawLimit())
        throw new ExceedsWithdrawLimitException("You can't withdraw more than R$" + getWithdrawLimit());
        if(amount > getBalance())
            throw new InsufficientFundsException("You can't withdraw more than R$" + getBalance());
    }

    // GETTER & SETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
