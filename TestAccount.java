//*************************************************************************
//Week 12 - Practice Assignment
//TestAccount.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: A Test Driver for the Account class
//*************************************************************************


public class TestAccount {

    public static void main(String[] args) {

        // test constructor 1
        System.out.println("\n\n---- Test constructor 1 ----");
        Account a1 = new Account("BK1012", "Ben Kenobi");

        System.out.println("\na1:");
        System.out.println("Account Owner: " + a1.getName() + "\nID: " + a1.getID());

        // test constructor 2
        System.out.println("\n\n---- Test constructor 2 ----");
        Account a2 = new Account("AS3025", "Anakin Skywalker", 1000);

        System.out.println("\na2:");
        System.out.println("Account Owner: " + a2.getName() + "\nID: " + a2.getID() + "\nBalance: $" + a2.getBalance());

        // test credit function
        System.out.println("\n\n---- Add $100 to balance ----");
        System.out.println("\nOld Balance: $" + a2.getBalance());
        a2.credit(100);
        System.out.println("New Balance: $" + a2.getBalance());

        // test debit function
        System.out.println("\n\n---- Subtract $50 from balance ----");
        System.out.println("\nOld Balance: $" + a2.getBalance());
        a2.debit(50);
        System.out.println("New Balance: $" + a2.getBalance());

        Account a3 = new Account("BF6681", "Boba Fett", 100);

        // test "amount exceeded" check in debit function
        System.out.println("\n\n---- Overdraw from account balance ----");
        System.out.println("\nOld Balance: $" + a3.getBalance());
        a3.debit(101);
        System.out.println("New Balance: $" + a3.getBalance());

        // test transferTo function
        System.out.println("\n\n---- Transfer money across accounts ----");
        a3.transferTo(a2, 100);

        System.out.println("\n-a2 account-" + a2);
        System.out.println("\n-a3 account-" + a3);

        // test "amount exceeded" check in transferTo function
        System.out.println("\n\n---- Over-transfer from account balance ----\n");
        a3.transferTo(a2, 2000);

        System.out.println("\n-a2 account-" + a2);
        System.out.println("\n-a3 account-" + a3);
    }
}
