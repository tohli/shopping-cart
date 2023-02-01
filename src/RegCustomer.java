import java.util.ArrayList;

public class RegCustomer extends Customer {

	
    private static double discountLimit = 40;
    private static double discountAmount = 0.03;
    private static double pointsLimit = 100;
    private static double pointGainRate = 0.02;
    
	public RegCustomer(String firstName, String lastName, ArrayList<Transaction> transactions) {
		
		super(firstName, lastName, transactions);
	}

	@Override
	public void gainPoint(double transactionValue) {
		
		setTotalPoints(transactionValue > pointsLimit ? transactionValue * pointGainRate : 0); 	}

	@Override
	public double transactionPromo(double transactionValue) {
		
		 return transactionValue > discountLimit ? (transactionValue - discountLimit) * discountAmount : 0;
	}
	
}