import java.text.*;
import java.util.*;

public class Expense {
	
	DateFormat dateFormat = new SimpleDateFormat ("yyyy/mm/dd");
	
	enum categories {
		CLOTHES, TRANSPORT, FOOD, HEALTH, BILLS, LOANS
	}
	
	// Instance Variables.
	private String name;
	private int value;
	private String description;
	private categories category;
	private String date;
	
	
	// Empty Constructor.
	public Expense() {
		
	}
	
	
	// Constructor to initialize expenses data.
	public Expense(String name, int value, String description, categories category) {
		
		this.name = name;
		this.value = value;
		this.description = description;
		this.category = category;
		this.setDate(dateFormat.format(new Date()));
	}
	
	
	// Setters And Getters.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public categories getCategory() {
		return category;
	}
	public void setCategory(categories category) {
		this.category = category;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
