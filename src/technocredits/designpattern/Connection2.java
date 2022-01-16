package technocredits.designpattern;

// Eager/Early Loading singleton design pattern
public class Connection2 {

	private String username = "mkanani";
	private String password = "mkanani123";
	
	private static Connection2 con = new Connection2();
	
	private Connection2(){
		// To connect DB
	}
	
	public static Connection2 getObject(){
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
