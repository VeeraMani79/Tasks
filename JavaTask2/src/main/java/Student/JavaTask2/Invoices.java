package Student.JavaTask2;

public class Invoices {
	private  int itemId;
	private String itemName;
	private int itemQty;
	private float totalPrice ;
	private String itemSoldDete;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getItemSoldDete() {
		return itemSoldDete;
	}
	public void setItemSoldDete(String itemSoldDete) {
		this.itemSoldDete = itemSoldDete;
	}
	public Invoices(int itemId, String itemName, int itemQty, float totalPrice, String itemSoldDete) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.itemSoldDete = itemSoldDete;
	}
	
	

}
