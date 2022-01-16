package kavleen;

public class A11_String {
	
	int First(String name , char ch) {
		int Index=0;
		for (int index=0;index<name.length(); index++) {
			if(name.charAt(index)==ch) {
				System.out.println("The first occurence of " + ch + "character in string " + name + "is" + index);
			    break;
			}
		}
		return Index;
	}
	int last (String name , char ch) {
		int Index=0;
		for (int index= name.length()-1 ; index>0; index--) {
			if (name.charAt(index)==ch) {
		     System.out.println("The last occurence is :" + ch + "character in string " + name + "is" + index);
			break;
			}
		}
		return Index;
	}
	boolean characterFound(String name , char ch ) {
		int index;
		 boolean flag = false ;
		 for( index=0;index<name.length();index++){
			 if(name.charAt(index)==ch) {
				 System.out.println();
				 flag=true; 
			 }		
		}
		return false;
	}
	int total(String name , char ch) {
		int count = 0;
		for( int index=0;index<name.length();index++){
			 if(name.charAt(index)==ch)
				count++;
	}
		return count;
}

	 public static void main (String [] args) {
		
		A11_String string = new A11_String();
		string.First("Technocredit", 'e');
		string.last("Technocredit", 'e');
		boolean b = string.characterFound("Technocredit", 'e');
		System.out.println(b);
		int sum = string.total("Technocredit",'e');
		System.out.println("The total sum is " + sum);
		
	}
}
