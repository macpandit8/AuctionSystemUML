package AuctionSystem;

public class Auction {

	/**
	 * 
	 */
	public boolean auction_Open = true;
	/**
	 * 
	 */
	public int Count_Auction = 1;
	/**
	 * 
	 */
	public double base_amount;
	/**
	 * 
	 */
	public int itemID = 1;
	/**
	 * 
	 */
	public String itemName;
	/**
	 * 
	 */
	private String created_by;
	/**
	 * 
	 */
	public String description;
	/**
	 * Getter of auction_Open
	 */
	Bid b = new Bid("None", 0.0);
	
	public Auction(String itemName, String description, double base_amount, String created_by) {
		this.auction_Open = true;
		this.itemName = itemName;
		this.description = description;
		this.base_amount = base_amount;
		this.created_by = created_by;
		
		
	}
	
	public boolean getAuction_Open() {
	 	 return auction_Open; 
	}
	/**
	 * Setter of auction_Open
	 */
	public void setAuction_Open(boolean auction_Open) { 
		 this.auction_Open = auction_Open;
	}
	/**
	 * Getter of Count_Auction
	 */
	public int getCount_Auction() {
	 	 return Count_Auction; 
	}
	/**
	 * Setter of Count_Auction
	 */
	
	/**
	 * Getter of base_amount
	 */
	public double getBase_amount() {
	 	 return this.base_amount; 
	}
	/**
	 * Setter of base_amount
	 */
	public void setBase_amount(double base_amount) {
		 this.base_amount = base_amount;
	}
	/**
	 * Getter of itemID
	 */
	public int getItemID() {
	 	 return this.itemID;
	}
	/**
	 * Setter of itemID
	 */
	public void setItemID(int itemID) { 
		 this.itemID = itemID; 
	}
	/**
	 * Getter of itemName
	 */
	public String getItemName() {
	 	 return this.itemName; 
	}
	/**
	 * Setter of itemName
	 */
	public void setItemName(String itemName) { 
		 this.itemName = itemName; 
	}
	/**
	 * Getter of created_by
	 */
	public String getCreated_by() {
	 	 return this.created_by;
	}
	/**
	 * Setter of created_by
	 */
	public void setCreated_by(String created_by) { 
		 this.created_by = created_by; 
	}
	/**
	 * Getter of description
	 */
	public String getDescription() {
	 	 return this.description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	public void closeAuction(int itemID) { 
		// TODO Auto-generated method
		this.auction_Open = false;
	 }
	/**
	 * 
	 */
	public void view_details() { 
		// TODO Auto-generated method
		System.out.printf("%d\t\t%s\t\t%s\t\t%.2f\t\t%s\t\t%b\t\t%.2f\t\t%s\n", 
				this.itemID, this.itemName, this.description, this.base_amount, 
				this.created_by, this.auction_Open, this.b.getAmount(), this.b.getCreated_by());
	 }
	/**
	 * 
	 */
	public void get_all_close_auction() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void addproduct() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void extend_duration() { 
		// TODO Auto-generated method
	 }
	
	/**
	 * 
	 */
	public void get_all_running_auction() { 
		// TODO Auto-generated method
		
	 } 

}
