package ShoppingCart;

import java.util.*;

public class ShoppingBasket {

	String ProductName;
	double ProductPrice;
	int ProductQTY;
	double ProductGST;
	
	public ShoppingBasket(String ProductName,double ProductPrice,double ProductGST,int ProductQTY )
	{
		this.ProductName=ProductName;
		this.ProductPrice=ProductPrice;
		this.ProductQTY=ProductQTY;
		this.ProductGST=ProductGST;
	}
	public void ProductName(String ProductName)
	{
		this.ProductName=ProductName;
	}
	public String getProductName() {
		return ProductName;
	}

	public double getProductPrice() {
		return ProductPrice;
	}

	public int getProductQTY() {
		return ProductQTY;
	}
	
	public double getProductGST() {
		return ProductGST;
	}
	
}

