package technocredits.designpattern;

public class Client {

	public static void main(String[] args) {
		Connection con1 = Connection.getObject();
		System.out.println(con1);
		
		Connection con2 = Connection.getObject();
		System.out.println(con2);
	}
}
