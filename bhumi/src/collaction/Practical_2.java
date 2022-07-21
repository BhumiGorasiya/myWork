package collaction;

import java.util.ArrayList;

class Product{
	
		private int id;
		private String name;
		private double price;
		private float discount;
		
		public Product(int id, String name, double price, float discount) {
	 
			this.id = id;
			this.name = name;
			this.price = price;
			this.discount = discount;
		
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public float getDiscount() {
			return discount;
		}

		public void setDiscount(float discount) {
			this.discount = discount;
		}
		
}

public class Practical_2 {
	public static void main(String[] args) {
		
		
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(11,"XPS", 23444.55,10.0f));
		productList.add(new Product(12,"Lenovo", 234433.55, 5.0f));
		productList.add(new Product(13, "Mac Book", 123444.55, 14.0f));
		
		for(Product p : productList)
		{
			System.out.println("id : "+p.getId());
			System.out.println("name : "+p.getName());
			System.out.println("price : "+p.getPrice());
			System.out.println("discount :"+p.getDiscount());
		}
		
		System.out.println("*************************************************");
		
		for(int i = 0; i<productList.size(); i++)
		{
			Product p = productList.get(i);
			System.out.println("id : "+p.getId());
			System.out.println("name : "+p.getName());
			System.out.println("price : "+p.getPrice());
			System.out.println("discount :"+p.getDiscount());
	
		}
		
	}    

}
