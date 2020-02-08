package com.mohammad.obeidat;

import java.util.ArrayList;

public class User {

    // Instance variables.
    private String name;
    private int salary, balance, income;
    // Array List To Store All User Expense.
    private ArrayList<Expense> userExpenses = new ArrayList<>();


    // Empty Constructor.
    public User() {

    }

    public User(String name, int salary, int balance) {
        this.name = name;
        this.salary = salary;
        this.balance = balance + salary;
    }

    // Getters & Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
        this.balance += income;
    }

    // Utility Function To Add New Expense.
    public void addNewExpense(Expense expense) {
        if (this.balance < expense.getValue()) {
            System.out.print("You don't have enough money in your balance.");
        } else {
            if (userExpenses.add(expense)) {
                System.out.println("Expense Added Successfully.");
                updateBalance(expense.getValue());
                System.out.println("Your Current Balance: " + getBalance());
            } else {
                System.out.println("Something Went Wrong, Try Again.");
            }
        }
    }

    // Utility Function To Update Balance
    public void updateBalance(int balanceValue) {
        if (balanceValue >= 0)
            this.balance -= balanceValue;
        else this.balance += balanceValue;
    }

    // Utility Function To Display All User Expense.
    public void displayUserExpenses() {
        if (userExpenses.size() == 0) {
            System.out.println("There's No Expenses Yet.");
        } else {
            System.out.println(getName() + " Expenses: \n\n");
            for (Expense expense : userExpenses) {
                System.out.print(
                        "Expense Name: " + expense.getName() + "\n"
                                + "Value: " + expense.getValue() + "\n"
                                + "Description: " + expense.getDescription() + "\n"
                                + "Category: " + (expense.getCategory() == null ? "Not Specified" : expense.getCategory()) + "\n"
                                + "Added Date: " + expense.getDate().split(" ")[0] + " on " + expense.getDate().split(" ")[1]
                );
                System.out.println();
                System.out.println("_________________________________________________________________________________________");
                System.out.println();
            }
        }
    }
}
