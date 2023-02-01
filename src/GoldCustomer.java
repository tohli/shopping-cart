import java.util.ArrayList;

public class GoldCustomer extends Customer {
	private static double discountAmount = 0.05;
    private static double pointGainRate = 0.05;

	public GoldCustomer(String firstName, String lastName, ArrayList<Transaction> transactions) {
		super(firstName, lastName, transactions);
	
	}

	@Override
	public void gainPoint(double transactionValue) {
		setTotalPoints(getTotalPoints() + transactionValue * pointGainRate);	}

	@Override
	public double transactionPromo(double transactionValue) {
		
		 return transactionValue * discountAmount;
		
		
	}
}
