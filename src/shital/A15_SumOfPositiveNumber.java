package shital;

class A15_SumOfPositiveNumber{

	void findSumOfPositiveNumber(int[] number){
		
		int sum=0;
		for(int index=0;index<number.length;index++){
			if(number[index]>0){
				sum=sum+number[index];
			}
		}
		System.out.println("Sum of Positive is :"+sum);		
	}
	
	public static void main(String[] args){
		A15_SumOfPositiveNumber sumOfPositiveNumber=new A15_SumOfPositiveNumber();
		int[] number={10,20,-33,-55,2};
		sumOfPositiveNumber.findSumOfPositiveNumber(number);
	}

}