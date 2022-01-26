package technocredits;

public class BuilderClient {

	public static void main(String[] args) {
		Builder builder1 = new Builder(123,"Techno");
		builder1.setAdress("Baner");
		builder1.printDetails();
		
		
		Builder builder2 = new Builder();
		
	}
}
