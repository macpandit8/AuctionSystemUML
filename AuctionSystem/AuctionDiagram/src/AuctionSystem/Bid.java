package AuctionSystem;

public class Bid {

	/**
	 * 
	 */
	private String created_by;
	/**
	 * 
	 */
	public double amount;
	/**
	 * 
	 */
	public int bid_id;
	/**
	 * 
	 */
	public int userID;
	/**
	 * 
	 */
	public int bid_item_id;
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
	 * Getter of amount
	 */
	public double getAmount() {
	 	 return amount; 
	}
	/**
	 * Setter of amount
	 */
	public void setAmount(double amount) { 
		 this.amount = amount; 
	}
	/**
	 * Getter of bid_id
	 */
	public int getBid_id() {
	 	 return bid_id; 
	}
	public void setBid_id(int bid_id) { 
		 this.bid_id = bid_id; 
	}
	/**
	 * Getter of userID
	 */
	public int getUserID() {
	 	 return userID; 
	}
	/**
	 * Setter of userID
	 */
	public void setUserID(int userID) { 
		 this.userID = userID; 
	}
	/**
	 * Getter of bid_item_id
	 */
	public int getBid_item_id() {
	 	 return bid_item_id; 
	}
	/**
	 * Setter of bid_item_id
	 */
	public void setBid_item_id(int bid_item_id) { 
		 this.bid_item_id = bid_item_id; 
	}
	
	/**
	 * 
	 * @return 
	 */
	public boolean isWinning() { 
		// TODO Auto-generated method
		return false;
	 }

	/**
	 * 
	 * @param itemID 
	 */
	public void get_bids_for_item(int itemID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void addBid() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param itemID 
	 */
	public void get_winner_for_item(int itemID) { 
		// TODO Auto-generated method
	 } 

}
