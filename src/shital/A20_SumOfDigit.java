package shital;

class A20_SumOfDigit{

	void printSumOfDigit(String name){
		int sum=0;
		System.out.println("Found Digit in below String :"+name);
		for(int index=0;index<name.length();index++){	
			char ch=name.charAt(index);
			if(Character.isDigit(ch)) {
				int num =Character.getNumericValue(ch);
				sum=sum+num;
				System.out.println("Digit is :"+num);
			}	
		}
		System.out.println("Sum of Digit is :"+sum);
	}
	
	public static void main(String[] args){
		A20_SumOfDigit sumOfDigit=new A20_SumOfDigit();
		sumOfDigit.printSumOfDigit("tech1noc9red3its");
	}
}
