package devopsdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	public List<Users> find() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		List<Users> list=new ArrayList<>();
		Connection conn=Util.getConnection();
		String sql="select * from users order by users.UUID";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Users users = new Users();
			users.setName(rs.getString(3));
			list.add(users);
		}
		rs.close();
		pstmt.close();
		conn.close();
		for(Users usersprint:list) {
			System.out.println(usersprint.getName());
		}
		return list;
	}

}
