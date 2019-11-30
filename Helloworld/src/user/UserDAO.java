// 데이터와 연동 하고 데이터를 기록하고 가져오는 역할  데이터 접근 객체 
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DatabaseUtill;

public class UserDAO {

	
	public int join(String userID, String userPassword)
	{
		String SQL ="INSERT INTO USER VALUES (?,?)";
		try {
			Connection conn =DatabaseUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2,userPassword);
			return pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
}
