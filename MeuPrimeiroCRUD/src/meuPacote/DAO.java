package meuPacote;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.List;

public class DAO {
	private Connection connection = null;
	public DAO() {
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/p13", "root", "971025");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public List<Posts> getLista() {
		List<Posts> posts = new ArrayList<Posts>();
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("SELECT * FROM Posts");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Posts post = new Posts();
				post.setPost_id(rs.getInt("post_id"));
				//post.setUser_id(rs.getString("user_id"));
				post.setContent(rs.getString("content"));
				//Calendar data = Calendar.getInstance();
				//data.setTime(rs.getDate("data"));
				//post.setData(data);
				//post.setCollection(rs.getString("collection"));
				posts.add(post);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			return posts;
		}

	public void close() {

		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void cria(Posts post) {
		String sql = "INSERT INTO Posts" + "(content) values(?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			//stmt.setString(1,post.getUser_id());
			stmt.setString(1,post.getContent());
			//stmt.setDate(3, new Date(post.getData().getTimeInMillis()));
			//stmt.setString(4,post.getCollection());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void atualiza(Posts post) {
		String sql = "UPDATE Posts SET " + "content=? WHERE post_id=?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			//stmt.setString(1, post.getUser_id());
			stmt.setString(1, post.getContent());
			//stmt.setDate(3, new Date(post.getData().getTimeInMillis()));
			//stmt.setString(4, post.getCollection());
			stmt.setInt(2, post.getPost_id());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void remove(Integer post_id) {
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("DELETE FROM Posts WHERE post_id=?");
			stmt.setLong(1, post_id);
			stmt.execute();
			stmt.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
}