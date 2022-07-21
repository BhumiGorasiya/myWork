  package oops;

class product
{
	int productid;
	String name;
	String details;
	int mrp;
	int discount;
	int saleprice;
	
	void data(int p, String n, String d,int m, int ds) 
	{
		productid = p;
		name = n;
		details = d;
		mrp = m; 
		discount = ds;
		
	}
	
	String getname()
	{
		return name;
	}
	
	void showDetails()
	{
		System.out.println("Product Id = "+productid);
		System.out.println("Nmae ="+name);
		System.out.println("Details ="+details);
		System.out.println("MRP Price ="+mrp);
		System.out.println("Discount ="+discount);
	}
	
	void salePrice()
	{
		discount = mrp*discount/100;
		saleprice = mrp-discount;
		
		System.out.println("saleprice "+saleprice);
	}
}


public class task_1 {
	
	
	public static void main(String[] args) {
		
		product p1 = new product();
		p1.productid = 1;
		p1.name = "kurti";
		p1.details = "anarkali";
		p1.mrp = 3500;
		p1.discount = 20;
		
		
		product p2 = new product();
		p2.data(2, "saree", "silk", 4000, 20);
		
		p1.showDetails();
		p1.salePrice();
		
		System.out.println("--------------------------");
	
		
		p2.showDetails();
		
		System.out.println("Product Name :"+p1.getname());
		
	
		p2.salePrice();
		
	}
	

}
