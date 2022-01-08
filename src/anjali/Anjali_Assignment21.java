package anjali;

public class Anjali_Assignment21 {
	
	static String printonlydigitInstring(String input){
		String name ="";
	    for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index))) {
			    int num= Character.getNumericValue(input.charAt(index));
				name=name+num;
			}
		}
		return name;
		
	}

	public static void main(String[] args) {
		String output=printonlydigitInstring("Techno12345credits6789");
		System.out.println(output);
	}

}
