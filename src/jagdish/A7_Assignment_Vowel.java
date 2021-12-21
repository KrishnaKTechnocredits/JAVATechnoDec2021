package jagdish;

public class A7_Assignment_Vowel {
	 void vowelCheck(String name ){
		     System.out.println("The vowel's are :- ");
		  for(int index=0; index<name.length();index++) {
			   if(name.charAt(index)== 'a' || name.charAt(index)=='e' || name.charAt(index)== 'i' ||
					   name.charAt(index)== 'o' ||name.charAt(index)== 'u' || name.charAt(index)== 'A' || name.charAt(index)=='E' || name.charAt(index)== 'I' ||
					   name.charAt(index)== 'O' ||name.charAt(index)== 'U'){
				   System.out.println(name.charAt(index));
		   }	 	
		 }
	   } 
	   
	   void evenPosition(String name) {
		   System.out.println("The evenPosition character's are :- ");
		   for(int index=0; index<name.length(); index++) {
			   if(index %2 ==1) {
				   System.out.println(name.charAt(index));
			   }   
		   }		   
	   }
	 

	public static void main(String[] args) {
		A7_Assignment_Vowel a7_assignment_vowel = new A7_Assignment_Vowel();
		a7_assignment_vowel.vowelCheck("aeroship");
		a7_assignment_vowel.evenPosition("technocredits");
	}
}
