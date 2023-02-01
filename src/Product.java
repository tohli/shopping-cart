
public class Product {

	private String pname;
	private double price;
	private boolean lux;
	private double vat = 0.08;
	private double productPromo;
	

	public Product(String pname, double price, boolean lux, double productPromo) {
	
		this.pname = pname;
		
		if(price>0) {
		this.price = price;
		}
		else {
		this.price = 0;
		}
		
		this.lux = lux; //If product type is luxury , =true ----- if product type is not luxury, =false
		
		this.productPromo=productPromo;
		setVat(vat);

	}
	


	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getLux() {
		return lux;
	}

	public void setLux(boolean lux) {
		this.lux = lux;
	}

	
	public double getVat() {
		return this.vat;
	}

	public void setVat(double vat) {
		this.vat = lux ? 0.10 : vat;
	}

	public double getProductPromo() {
		return productPromo;
	}

	public void setProductPromo(double productPromo) {
		this.productPromo = productPromo;
	}

	public String toString()	
	{	
		 return String.format(getPname()+ " " + getPrice()+ " "+ getLux());	
	}

 
	

}