// �����Ϳ� ���� �ϰ� �����͸� ����ϰ� �������� ����  ������ ���� ��ü 
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
