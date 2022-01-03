package shital;

class A15_MaxNumber{

	int findMaxNumber(int[] number){
		int max=number[0];
		for(int index=1;index<number.length;index++){
			if(max<number[index])
				max=number[index];
		}
		System.out.println("\nMaximum Number is: "+max);
		return max;
		
	}
	
	public static void main(String[] args){
		A15_MaxNumber maxNumber=new A15_MaxNumber();
		int[] number={10,28,56,97,42,118,65,75};
		System.out.println("Given Number is: "+number.length);
		maxNumber.findMaxNumber(number);
	}
}