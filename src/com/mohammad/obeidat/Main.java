package com.mohammad.obeidat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome Message.
        System.out.println("Welcome To Expenses Manager :)");

        // Make The User To Provide His Information.
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();

        System.out.println("\nPlease Enter Your Salary: ");
        int salary = input.nextInt();

        System.out.println("\nPlease Enter Your Current Balance: ");
        int balance = input.nextInt();

        // Initialize New User.
        User user = new User(name, salary, balance);
        System.out.println("Hello " + user.getName() + " Here's Your Information:\n Your Monthly Salary: "
                + user.getSalary() + "\n Your Current Balance: " + user.getBalance());

        // Declare Variables To Hold Expense Info.
        String expenseName, expenseDescription;
        int expenseValue;
        CATEGORIES expenseCategory;

        // Welcome Message.
        System.out.println("Please Select What You Want To Do: \n");

        // Variable Used To Control User Inputs.
        int selection;
        // Variable To Control While Loop.
        int flag = 0;
        while (flag == 0) {

            System.out.println("\n 1. Show Your Expenses. \n 2. Add New Expense. \n 0. EXIT. \n");
            selection = input.nextInt();
            // Invoke 'nextLine()' method to void console from skipping the user input in the next "nextLine()" method.
            input.nextLine();

            switch (selection) {
                case 0:
                    System.out.println("Thank For Using Expenses Manager...");
                    flag += 2;
                    break;
                case 1:
                    user.displayUserExpenses();
                    break;
                case 2:
                    System.out.print("Enter Expense Name: ");
                    expenseName = input.nextLine();
                    System.out.print("Enter Expense value: ");
                    expenseValue = input.nextInt();
                    System.out.print("Enter Expense Category, Use One Of The Following Categories: \n"
                            + "1- CLOTHES   2- TRANSPORT   3- FOOD   4- HEALTH   5- BILLS   6- LOANS :\t");
                    int chosenExpenseCategory = input.nextInt();

                    // Invoke 'nextLine()' method to void console from skipping the user input in the next "nextLine()" method.
                    input.nextLine();
                    switch (chosenExpenseCategory) {
                        case 1:
                            expenseCategory = CATEGORIES.CLOTHES;
                            break;
                        case 2:
                            expenseCategory = CATEGORIES.TRANSPORT;
                            break;
                        case 3:
                            expenseCategory = CATEGORIES.FOOD;
                            break;
                        case 4:
                            expenseCategory = CATEGORIES.HEALTH;
                            break;
                        case 5:
                            expenseCategory = CATEGORIES.BILLS;
                            break;
                        case 6:
                            expenseCategory = CATEGORIES.LOANS;
                            break;
                        default:
                            expenseCategory = null;
                    }
                    System.out.print("Enter Expense Description: ");
                    expenseDescription = input.nextLine();

                    user.addNewExpense(new Expense(expenseName, expenseValue, expenseDescription, expenseCategory));
                    break;
                default:
                    System.out.print("There is No Select");
                    break;
            }
        }
    }
}
