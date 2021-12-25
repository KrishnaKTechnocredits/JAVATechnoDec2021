package anshuma;

public class Test_1 {
	
	void IsNonRepeatedChar (String str1) { 
		  for (int i = 0; i < str1.length(); i++) {
		   boolean flag = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     flag = false;
		     break;
	}
		   }
		   if (flag) {
			System.out.println("The first non repeated character in String is: " + str1.charAt(i));
			break;
		    }
		  }
	}

		 public static void main(String[] args) {
			 String str1 = "technocredits";
			 Test_1 test1 = new Test_1();
			 test1.IsNonRepeatedChar (str1);
			
		 }
		  
		    
		 }
		    
		 