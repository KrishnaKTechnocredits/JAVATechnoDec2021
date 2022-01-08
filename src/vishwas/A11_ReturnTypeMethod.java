package vishwas;

public class A11_ReturnTypeMethod {
	
	int getFirstOccurenceOfGivenChar(String name,char ch) {
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				return index;
		}
		return -1;
	}
	
	int getlastOccurenceOfGivenChar(String name,char ch) {
		for(int index =name.length()-1;index>=0;index--) {
			if(name.charAt(index) == ch) 
				return index;	
		}
		return -1;
	}
	
	boolean getIsCharPresent(String name,char ch) {
		boolean isCharflag = false;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				isCharflag = true;
		}
		return isCharflag;
		}
		
	int getTotalOccurenceOfChar(String name,char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		A11_ReturnTypeMethod returnTypeMethod =new A11_ReturnTypeMethod();
		int temp = returnTypeMethod.getFirstOccurenceOfGivenChar("PranotiPatil", 'a');
		if(temp > -1) 
			System.out.println("First occurrence of given character from given string :" +temp);
		else
			System.out.println("Given charcter is not present in given string");
		
		int temp1 = returnTypeMethod.getlastOccurenceOfGivenChar("PranotiPatil", 'a');
		if(temp1 > -1) 
			System.out.println("Last occurrence of given character from given string :" +temp1);
		else
			System.out.println("Given charcter is not present in given string");
		
		boolean temp3 = returnTypeMethod.getIsCharPresent("PranotiPatil", 'q');
		 if (temp3 == true)
			 System.out.println("Given character is present in given string :" +temp3);
		 else
			 System.out.println("Given charcter is not present in given string : " +temp3);
		 
		 int temp4 = returnTypeMethod.getTotalOccurenceOfChar("PranotiPatiltt", 't');
		 if (temp4 > 0)
			 System.out.println("Total occurrence of given character from given string :" +temp4);
		 else
			 System.out.println("Given charcter is not present in given string : " +temp4);	 
			 
	}
}
