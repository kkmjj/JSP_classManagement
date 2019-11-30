//DATA TRANSFER OBJECT : 데이터를 담기 
package user;

public class UserDTO {

	
	String userID;
	String userPassword;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
