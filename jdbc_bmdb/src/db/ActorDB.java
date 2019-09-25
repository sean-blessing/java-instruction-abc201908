package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Actor;

public class ActorDB {
	
	private Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/bmdb?useSSL=false";
        String username = "bmdb_user";
        String pwd = "sesame";
        
        Connection connection = DriverManager.getConnection(
        		dbUrl, username, pwd);
        return connection;
    }
	
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<>();
		
		try {
			// get the connection
			Connection conn = getConnection();
			//create sql statement (prepared stmt)
			String sql = "SELECT * FROM Actor";
			PreparedStatement ps = conn.prepareStatement(sql);
			// execute query
			ResultSet rs = ps.executeQuery();
			// parse result set into Java 'Actor' objects
			while (rs.next()) {
				// note that you can pull fields out of a rs
				// by either column # or column name
				int id = rs.getInt(1);
				String firstName = rs.getString("FirstName");  //could have used 2
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date bdate = rs.getDate(5);
				Actor a = new Actor(id, firstName, lastName, bdate, gender);
				actors.add(a);
			}
			
		}
		catch (SQLException sqle) {
			System.out.println("Error getting actors");
			System.out.println(sqle);
		}
		// return a list of Actors
		return actors;
	}
	
	

}
