import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Product> products = new ArrayList();
		ArrayList <Customer> customers = new ArrayList();
		ArrayList <Transaction> transactions = new ArrayList();
		
		Product p = new Product("Apple", 10, false, 0.07 );
		Product p1 = new Product ("TV", 500, true, 0.20);
		Product p2 = new Product ("Mobile Phone", 100, true, 0.20);
		Product p3 = new Product ("Couch", 50, true, 0.10);
		Product p4 = new Product ("Phone charger", 20, false, 0);
		Product p5 = new Product ("Potato chips", 5, false, 0.05);


		products.add(p);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);



		
		Customer c = new RegCustomer("Feyza","Öztürk", transactions);
		Customer c1 = new GoldCustomer("Yusuf","Coskun", transactions);
		Customer c2 = new RegCustomer ("Bertan", "Badur", transactions);
		Customer c3 = new GoldCustomer("Reydan", "Yasar", transactions);
		Customer c4 = new NonCustomer ("Non Customer", "Null Tester", transactions);

		customers.add(c);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		//c4 is a non-customer so it isn't added to the customers ArrayList.


		Transaction s = new Transaction(c);
		Transaction s1 = new Transaction(c1);
		Transaction s2 = new Transaction(c2);
		Transaction s3 = new Transaction(c3);
		Transaction s4 = new Transaction(c4);
		Transaction s5 = new Transaction(c1);

		transactions.add(s);
		transactions.add(s1);
		transactions.add(s2);
		transactions.add(s3);
		transactions.add(s4);
		transactions.add(s5);



		s.addSales(p, 4);
		s.addSales(p5, 1);
		s1.addSales(p1, 5);
		s1.addSales(p4, 5);
		s2.addSales(p2, 5);
		s2.addSales(p3, 10);
		s3.addSales(p3, 5);
		s4.addSales(p4, 5);
		s5.addSales(p2, 10); //Accumulates points from previous transactions
		 
	
	//s1.cancelFromSales(p4);
		
		for(int k = 0; k<transactions.size(); k++) {
			transactions.get(k).Invoice();
		}
		

	
				
	}
}
