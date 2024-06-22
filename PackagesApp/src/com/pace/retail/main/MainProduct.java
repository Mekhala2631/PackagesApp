package com.pace.retail.main;
import com.pace.retail.Product;
public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobile = 
				new Product(123,"iPhone",154234.25f);
		Product laptop = new Product(1556,"Mac Book",124856.18f);
		System.out.println("Mobile Phone details");
		System.out.println( mobile.getId() );
		System.out.println( mobile.getName() );
		System.out.println( mobile.getPrice() );
		//update price
		mobile.setPrice(150000.00f);
		System.out.println( mobile.getPrice() );
	}
	

}
