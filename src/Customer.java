import java.util.ArrayList;

public abstract class Customer {
	
	protected String firstName;
	protected String lastName;
	private double totalPoints;
	
	public ArrayList<Transaction> transactions;
	
	
	public Customer(String firstName, String lastName, ArrayList<Transaction> transactions) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.transactions=transactions;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString()	
	{	
		 return String.format(getFirstName() + " " + getLastName());	
	}
	
	 public double getTotalPoints() { 
		 return totalPoints; 
	 }
	 
	 public void setTotalPoints(double totalPoints) {
	        this.totalPoints = totalPoints;
	    }

	
	
	public abstract void gainPoint(double transactionValue);
	public abstract double transactionPromo(double transactionValue);
	


	
	
	
	

	
}
