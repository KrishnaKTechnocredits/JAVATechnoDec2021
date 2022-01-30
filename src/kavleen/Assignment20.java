package kavleen;

public class Assignment20 {

	void sumOfDigits(String name){
		int sum = 0;
		for(int index = 0 ; index<name.length(); index++){
			if(Character.isDigit(name.charAt(index))){
				int num = Character.getNumericValue(name.charAt(index));
					sum = num +sum;
			}
		}
		System.out.println("The sum of all digits in String " + name +" is " + sum);
	}
	public static void main (String [] args){
		Assignment20 assignment20 = new Assignment20();
		assignment20.sumOfDigits("tech1noc59red3its");
		System.out.println("Hello");
	}
}
