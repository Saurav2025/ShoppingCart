package ShoppingCart;

import java.util.*;



public class Main {
	public static void main(String args[]) {

		List<ShoppingBasket> items = new ArrayList<ShoppingBasket>();
		items.add(new ShoppingBasket("Leather wallet", 1100, 18, 1));
		items.add(new ShoppingBasket("Umbrella", 900, 12, 4));
		items.add(new ShoppingBasket("Cigarette", 200, 28, 3));
		items.add(new ShoppingBasket("Honey    ", 100, 0, 2));

		System.out.println("ProductName\tProductPrice\t\tProductGST\tProductQTY");
		for (ShoppingBasket Basket : items) {
			System.out.println(Basket.getProductName() + "\t" + Basket.getProductPrice() + "\t\t\t" + Basket.getProductGST() + "\t\t"+ Basket.getProductQTY());
		}
		
		double MaximumGST=0;
		String MaxGSTProdName="";
		
		for(ShoppingBasket Basket : items)
		{
			double GST=Basket.getProductGST();
			double Price=Basket.getProductPrice();
			double CalculateGST=(GST*Price)/100;
			
			if(CalculateGST>MaximumGST)
			{
				MaximumGST=CalculateGST;
				MaxGSTProdName=Basket.getProductName();
			}
		}
		  System.out.println("Shopping Product with maximum GST amount: " + MaxGSTProdName);
		  
		  double TotalAmount=0;
		  for(ShoppingBasket Basket : items)
		  {
			  double ProductPrice=Basket.getProductPrice();
			  int ProductQTY=Basket.getProductQTY();
			  double ProductDiscount=0;
			  
			  if(ProductPrice>500)
				  ProductDiscount=(ProductPrice*5)/100;
			  double GSTAmount=(ProductPrice*Basket.getProductGST())/100;
			  TotalAmount+=((ProductPrice-ProductDiscount+GSTAmount)*ProductQTY);
			  
		  }
		  System.out.println("Total product amount to be paid "+TotalAmount);
	}
}
