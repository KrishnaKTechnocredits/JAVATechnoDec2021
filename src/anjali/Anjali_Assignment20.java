package anjali;

public class Anjali_Assignment20 {
	
	void findSumOfDigit(String name){
		int sum=0;
		for(int index=0;index<name.length();index++){
			if(Character.isDigit(name.charAt(index))){
				int num=Character.getNumericValue(name.charAt(index));
				sum=sum+num;
			}
		}System.out.println("The sum of all digits in String "+name+" is "+sum);
	}
	
	public static void main(String[] args) {
		Anjali_Assignment20 assignment20 = new Anjali_Assignment20();
		assignment20.findSumOfDigit("Techno1234credits56");
		}
}
