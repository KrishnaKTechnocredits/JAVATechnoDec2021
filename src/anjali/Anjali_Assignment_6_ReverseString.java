package anjali;

public class Anjali_Assignment_6_ReverseString {

	public static void main(String[] args) {
		printAllchar("anjali");
		reverse("ANJALI");
		
	}
	
	static void printAllchar(String input ){
		for(int index=0;index<input.length();index++){
			System.out.println(input.charAt(index));
		}	
	}
		
		static void reverse(String input ){
			for(int index=(input.length())-1;index>=0;index--){
				System.out.println(input.charAt(index));
		}
		
	} 

}
