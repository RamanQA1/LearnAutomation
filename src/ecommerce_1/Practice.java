package ecommerce_1;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(priority=1)
	public void createaccount() {
		
		System.out.println("Enter user valid details to create account");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Enter user valid credentails to login account");                        
	}
	@Test(priority=3)
	public void searchproduct() {
		System.out.println("search product by user");
	}
	@Test(priority=4)
	public void mensshirts() {
		System.out.println("Mens Shirts");
	}
	@Test(priority=5)
	public void blackshirt() {
		System.out.println("Black shirt for men");
	}
	@Test(priority=6)
	public void addtocart() {
		System.out.println("Product added to the cart");
	}
	@Test(priority=7)
	public void logout() {
		System.out.println("LOgout the account");
	}
	@Test(priority=8)
	public void customerfeedback() {
		System.out.println("Customer feedback");
	}
	
	@Test(priority=9)
	public void ordertracking() {
		System.out.println("order tracking of the product");
	}
	@Test(priority=10)
	public void makepayment() {
		System.out.println("make payment by customer");
	}
	
	@Test(priority=11)
	public void orderplaced() {
		System.out.println("Order placed");
	}
	@Test
	public void orderreplaced() {
		System.out.println("Order Replaced by customer");
	}
	

}
