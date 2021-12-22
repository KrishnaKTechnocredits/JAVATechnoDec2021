package abhishek;
class Assignment7{
	 void vowelCheck(String name ){
		     System.out.println("The vowels are :- ");
		  for(int index=0; index<name.length();index++) {
			   if(name.charAt(index)== 'a' || name.charAt(index)=='e' || name.charAt(index)== 'i' ||
					   name.charAt(index)== 'o' ||name.charAt(index)== 'u' || name.charAt(index)== 'A' || name.charAt(index)=='E' || name.charAt(index)== 'I' ||
					   name.charAt(index)== 'O' ||name.charAt(index)== 'U'){
				   System.out.println(name.charAt(index));
		   }	 	
		 }
	   } 
	   
	   void evenPosition(String name) {
		   System.out.println("The Even Position characters are :- ");
		   for(int index=0; index<name.length(); index++) {
			   if(index %2 ==1) {
				   System.out.println(name.charAt(index));
			   }   
		   }		   
	   }
	 

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.vowelCheck("technocredits");
		assignment7.evenPosition("technocredits");
	}
}