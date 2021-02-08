package com.company;

public class Account {

    private String id;
    private String name;
    private int balance;

// alt+insert > Constructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

// alt+insert > Getter for all 3 in order get them in Main app
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

// creating methods
    int credit(int amount) { return balance += amount; // + neprideda prie naujo balance, reikia +=
    }

    int debit(int amount) {
        if (amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeded in current account.");
        }
        return balance;
        }

    int transferTo(Account another, int amount){
        if (amount <= balance) {
            balance -= amount; // or this: debit(amount);
            another.credit(amount);  // crediting to another account was borrowed for learning purposes
        }
        else {
            System.out.println("Amount exceeded for transferring to another account.");
        }
        return balance;
    }

//alt+insert to String

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

