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
	public int itemID;
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
	public void setCount_Auction(int Count_Auction) { 
		 this.Count_Auction = Count_Auction; 
	}
	/**
	 * Getter of base_amount
	 */
	public double getBase_amount() {
	 	 return base_amount; 
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
	 	 return itemID; 
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
	 	 return itemName; 
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
	 	 return created_by; 
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
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	public void closeAuction(int auction) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void view_details() { 
		// TODO Auto-generated method
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
