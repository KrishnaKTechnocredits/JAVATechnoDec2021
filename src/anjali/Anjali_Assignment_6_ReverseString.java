package anjali;

public class Anjali_Assignment_6_ReverseString {

	public static void main(String[] args) {
		printAllchar("anjali");
		System.out.println("*******************************");
		
		reverse("ANJALI");
		
		Anjali_Assignment_6_ReverseString a6=new Anjali_Assignment_6_ReverseString();
		System.out.println("*******************************");
		a6.findOccOfChar("anjali", 'a');
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
		
	void findOccOfChar(String name ,char ch){
			int count=0;
			for(int index=0;index<name.length();index++){
				if(name.charAt(index)==ch)
					count++;
			}System.out.println(count);
	}

}
