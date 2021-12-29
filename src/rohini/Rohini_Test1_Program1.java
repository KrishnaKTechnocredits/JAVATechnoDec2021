package rohini;

public class Rohini_Test1_Program1 {

	void findNonRepeatingChar(String Name) {
	
		for (int i = 0; i < Name.length(); i++) {
			boolean flag=true;
			for (int j = 0; j < Name.length(); j++) {
              if (i!=j && Name.charAt(i) == Name.charAt(j)) 
					flag=false;  
				}
			if (flag==true) {
				System.out.println("Fisrt Non Repeating char is : " +Name.charAt(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Rohini_Test1_Program1 findchar = new Rohini_Test1_Program1();
		findchar.findNonRepeatingChar("technocredits");

	}

}
