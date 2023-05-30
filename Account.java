//*************************************************************************
//Week 12 - Practice Assignment
//Account.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Account class models a customers account with a money balance, credit and debit
//*************************************************************************


public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id,String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo (Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            balance -= amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public String toString () {
        return "\nAccount \n" + "ID: " + getID() + "\nname: " + getName() + "\nbalance: " + getBalance();
    }
}
