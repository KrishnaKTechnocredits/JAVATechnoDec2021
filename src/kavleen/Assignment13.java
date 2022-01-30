package kavleen;

public class Assignment13 {

	
	String name = "Kavleen";
	
	void duplicate() {
		System.out.println("All the duplicate characters are");
		for(int index=0 ; index<name.length();index++) {
			char ch = name.charAt(index);
			if(index == name.indexOf(ch)) {
				if(name.indexOf(ch)!= name.lastIndexOf(ch)) {
					System.out.println(ch + " is duplicate ");
			}	
		}
	}
}
	void unique() {
		System.out.println("All the unique characters are");
		for (int index=0 ; index<name.length();index++) {
			char ch = name.charAt(index);
			if(index==name.indexOf(ch)) {
				if(name.indexOf(ch)== name.lastIndexOf(ch)) {
					System.out.println(ch + " is unique");	
			}
	       }
		}
	}
	
	void firstUnique() {
		for (int index=0 ; index<name.length();index++) {
			char ch = name.charAt(index);
			if(name.indexOf(ch)== name.lastIndexOf(ch)) {
				System.out.println(ch + " is unique");	
				break;
		}
	   }	
	}
	
	
     void firstDuplicate() {
	   for (int index = 0 ; index <name.length(); index++) {
		   char ch = name.charAt(index);
		   if(name.indexOf(ch)!= name.lastIndexOf(ch)) {
				System.out.println(ch + " is first duplicate");	 
				break;
	   }	
	  }
	}
	
	public static void main (String [] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.duplicate();
		assignment13.unique();
		assignment13.firstUnique();
		assignment13.firstDuplicate();
	}
}
