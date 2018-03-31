package AuctionSystem;

public class User {

	/**
	 * 
	 */
	public int userID;
	/**
	 * 
	 */
	public String fullName;
	/**
	 * 
	 */
	public boolean voice_notification_enabled = false;
	/**
	 * 
	 */
	public String email;
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
	 * Getter of fullName
	 */
	public String getFullName() {
	 	 return fullName; 
	}
	/**
	 * Setter of fullName
	 */
	public void setFullName(String fullName) { 
		 this.fullName = fullName; 
	}
	/**
	 * Getter of voice_notification_enabled
	 */
	public boolean getVoice_notification_enabled() {
	 	 return voice_notification_enabled; 
	}
	/**
	 * Setter of voice_notification_enabled
	 */
	public void setVoice_notification_enabled(boolean voice_notification_enabled) { 
		 this.voice_notification_enabled = voice_notification_enabled; 
	}
	/**
	 * Getter of email
	 */
	public String getEmail() {
	 	 return email; 
	}
	/**
	 * Setter of email
	 */
	public void setEmail(String email) { 
		 this.email = email; 
	}
	/**
	 * 
	 */
	public void register() { 
		// TODO Auto-generated method
	 } 

}
