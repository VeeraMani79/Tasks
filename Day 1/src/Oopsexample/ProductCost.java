package Oopsexample;

public class ProductCost {

	int productPrice;
	int goodsAndServiceTax;
	
	public int findPrice(int productPrice) {
		return productPrice;
	}
	
	public int findPrice(int productPrice,int goodsAndServiceTax) {
		int totalCost=productPrice+goodsAndServiceTax;
		return totalCost;
		
	}
}
