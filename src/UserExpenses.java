import java.util.ArrayList;

public class UserExpenses {
	
	private ArrayList<Expense> userExpenses = new ArrayList<>();
	

	
	
	// Utility function to add new expense
	public void addNewExpense (Expense expense) {
		if(userExpenses.add(expense)) {
			System.out.println("Expense Added Successfulley.");
			System.out.println();
		}
	}
	
	
	public void display() {
		for(Expense expense : userExpenses) {
			System.out.print("Expense Name: "+expense.getName()+"\n" +"Value: "+expense.getValue()+
					"Description: "+expense.getDescription()+"Category: "+expense.getCategory()+"Date: "+expense.getDate());
			
			System.out.println();
			System.out.println("*****__________________________________*****_____________________________________________*****");
			System.out.println();
		}
	}

}
