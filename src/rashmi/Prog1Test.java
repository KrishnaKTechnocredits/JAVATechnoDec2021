package rashmi;

public class Prog1Test {
	 public void NonRepeatingChar(String str1) {
		   for (int i = 0; i < str1.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str1.length(); j++) {
		   if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
		  }
		  public static void main(String[] args) {
			  String str1 = "technocredits";
			  Prog1Test prog1test = new Prog1Test();
			  prog1test.NonRepeatingChar(str1);
			  
		 }
}
