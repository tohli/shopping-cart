import java.util.ArrayList;

public class NonCustomer extends Customer {

	public NonCustomer(String firstName, String lastName, ArrayList<Transaction> transactions) {
		super(firstName, lastName, transactions);
		this.firstName="";
		this.lastName="";
	}

	@Override
	public void gainPoint(double transactionValue) {
	
	}

	@Override
	public double transactionPromo(double transactionValue) {
	
		return 0;
	}

}
