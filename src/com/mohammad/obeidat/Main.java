package com.mohammad.obeidat;

import java.util.Scanner;

public class Main {
    private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		// Welcome Message.

		System.out.println("Welcome To Expenses Manager :)");

		// Make The User To Provide His Information.

		System.out.print("Please Enter Your Name: ");
		String name = input.nextLine();

		System.out.println("\nPlease Enter Your Salary: ");
		int salary = input.nextInt();

		System.out.println("\nPlease Enter Your Current Balance: ");
		int balance = input.nextInt();

		// Initialize DateTimeFormatter To Format The Date Depending On Specific
		// Pattern.
		DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// Get Current Date.
		LocalDateTime currentDate = LocalDateTime.now();
		// Format Current Date.
		String date = formattedDate.format(currentDate);
		// Casting String To Integer.
		int day = Integer.parseInt(date.split("/")[2]);

		// Initialize New User.

		User user = new User(name, salary, balance);
		// Auto Add Salary Value To Balance In The First Day Of Month.
		if (day == 01) {
			user.autoUpdateBalance();
		}
		// Show User Info.
		user.displayUserInfo();

		// Declare Variables To Hold Expense Info.
		String expenseName, expenseDescription;
		int expenseValue;
		CATEGORIES expenseCategory;
		int income;

		// Welcome Message.
		System.out.println("Please Select What You Want To Do: \n");

		// Variable Used To Control User Selection.
		int selection;

		// Variable To Control While Loop.
		int flag = 0;
		while (flag == 0) {

			System.out.println("\n 1. Show Your Expenses. \n 2. Add Income. \n 3. Add New Expense. \n 0. EXIT. \n");

			selection = input.nextInt();

			// Invoke 'nextLine()' to consumes the '\n' character that came from
			// 'nextInt()'.
			input.nextLine();

			switch (selection) {

			case 0:

				System.out.println("Thank For Using Expenses Manager...");
				flag++;
				break;

			case 1:

				user.displayUserExpenses();
				user.displayUserInfo();
				break;
			case 2:
				System.out.print("Enter The Income: ");
				income = input.nextInt();
				user.setIncome(income);
				user.displayUserInfo();
				input.hasNextLine();
			case 3:

				System.out.print("Enter Expense Name: ");
				expenseName = input.nextLine();

				System.out.print("Enter Expense value: ");
				expenseValue = input.nextInt();

				System.out.print("Enter Expense Category, Use One Of The Following Categories: \n"

						+ "1-CLOTHES   2-TRANSPORT   3-FOOD   4-HEALTH   5-BILLS   6-LOANS   7-SCHOOL   8-SOFTWARE   9-ACCESSORIES   10-SMART_DEVICES   11-OTHER :\t");

				int selectedExpenseCategory = input.nextInt();

				// Invoke 'nextLine()' to consumes the '\n' character that came from
				// 'nextInt()'.
				input.nextLine();

				switch (selectedExpenseCategory) {

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

				case 7:
					expenseCategory = CATEGORIES.SCHOOL;
					break;

				case 8:
					expenseCategory = CATEGORIES.SOFTWARE;
					break;

				case 9:
					expenseCategory = CATEGORIES.ACCESSORIES;
					break;

				case 10:
					expenseCategory = CATEGORIES.SMART_DEVICES;
					break;

				case 11:
					expenseCategory = CATEGORIES.OTHER;
					System.out.println("Please Specifiy The Category In The Description.");
					break;

				default:
					expenseCategory = null;
					break;
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
