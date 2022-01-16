package technocredits.designpattern;

// Lazy Loading singleton design pattern
public class Connection {

	private String username = "mkanani";
	private String password = "mkanani123";
	
	private static Connection con;
	
	private Connection(){
		// To connect DB
	}
	
	public static Connection getObject(){
		if(con == null)
			con = new Connection();
		return con;
	}
	
	void insertData(String query) {
		// insert data into DB
	}
	
	String selectData(String query) {
		// get the record from DB and return it
		return null;
	}
}
