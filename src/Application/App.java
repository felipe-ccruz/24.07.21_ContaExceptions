package Application;

import Model.Entities.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount ba1 = new BankAccount("Felipe", 100, 250);

        ba1.deposit(50);
        System.out.println(ba1.toString());

        ba1.withdraw(150);
        System.out.println(ba1.toString());

        ba1.deposit(1500);
        System.out.println(ba1.toString());

        ba1.withdraw(350);
        System.out.println(ba1.toString());

        ba1.withdraw(250);
        System.out.println(ba1.toString());
    }
}
