import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
	Scanner input=new Scanner (System.in);
	Customer customer;
	double transDis;
	double prePoint;
	double spendPoints;
	private ArrayList<Product> products;
	private ArrayList<Integer> quantities;
	

	public Transaction(Customer customer){
		products=new ArrayList<Product>();
		quantities=new ArrayList<Integer>();
		this.customer=customer;
		
	}
	
	public void addSales(Product p, int qnt){
		products.add(p);
		quantities.add(qnt);
		
	}
	 
	
	public void cancelFromSales(Product p)
	   {
	      int i = products.indexOf(p);
	      products.remove(i);
	      quantities.remove(i);
		
	   } 

	public double getPurePrice() {
		double pureTotal=0;
		for(int i=0;i<products.size();i++){
			pureTotal+=products.get(i).getPrice()*quantities.get(i)+(products.get(i).getPrice()*quantities.get(i)*products.get(i).getVat());
			
			
		}
		return pureTotal;
	}
	
	public double getTotalPrice(){
		double total=0;
		
		for(int i=0;i<products.size();i++){
			total+=(products.get(i).getPrice()*quantities.get(i)+(products.get(i).getPrice()*quantities.get(i)*products.get(i).getVat()))*(1-products.get(i).getProductPromo());
			
			
		}
		return total;
	}
	
	public void Invoice() {
		double totalVat=0;
		double totalProdDis=0;
		for(int i=0;i<products.size();i++){
		totalVat += products.get(i).getVat()*products.get(i).getPrice()*quantities.get(i);
		totalProdDis += (products.get(i).getPrice()*quantities.get(i)+(products.get(i).getPrice()*quantities.get(i)*products.get(i).getVat()))*(products.get(i).getProductPromo());
		}
		
		transDis =  customer.transactionPromo(getTotalPrice());
		prePoint = getTotalPrice() - transDis;
		customer.gainPoint(prePoint);
		
		System.out.printf("Customer name: "+ customer.toString() +  "%n%nTotal payment without promotions : %5.2f$%nTotal VAT: %5.2f$%nTotal product discounts: %5.2f$"
				+ "%nTotal transaction discounts: %5.2f$%n%n-- Total: %5.2f$ --%n",getPurePrice(), totalVat, totalProdDis, transDis, prePoint);
		
		System.out.printf("%nYou have %5.2f points available. How many points would you like to spend?%n", customer.getTotalPoints());
		
		spendPoints = input.nextDouble();
		
		if(spendPoints>customer.getTotalPoints()) {
			spendPoints = customer.getTotalPoints();
			customer.setTotalPoints(0);
			System.out.printf("%nYou have spent all of your points.%n");
		}
		else{
		customer.setTotalPoints(customer.getTotalPoints()-spendPoints);	
		System.out.printf("%nYou have %5.3f points remaining in your account.", customer.getTotalPoints());
		}
		
		prePoint -= spendPoints;
		
		System.out.printf("%nThe final value of your transaction is: %5.2f$%n", prePoint);
		System.out.println("---------------------------------------------------------------------------|");
	}

}
