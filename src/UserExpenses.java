import java.util.ArrayList;

public class UserExpenses {
	
	// Array List To Store All User Expenses.
	private ArrayList<Expense> userExpenses = new ArrayList<>();
	
	
	// Utility Function To Add New Expenses.
	public void addNewExpense (Expense expense) {
		if(userExpenses.add(expense)) {
			System.out.println("Expense Added Successfulley.");
			System.out.println();
		}
	}
	
	
	// Utility Function To Display All User Expenses.
	public void displayUserExpenses() {
		for(Expense expense : userExpenses) {
			System.out.print("Expense Name: "+expense.getName()+"\n" +"Value: "+expense.getValue()+
					"Description: "+expense.getDescription()+"Category: "+expense.getCategory()+"Date: "+expense.getDate());
			
			System.out.println();
			System.out.println("_________________________________________________________________________________________");
			System.out.println();
		}
	}

}
