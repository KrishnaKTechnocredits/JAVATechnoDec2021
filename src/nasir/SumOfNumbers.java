package nasir;
class SumOfNumbers{
	void setNumber(int num1, int num2){
		int sum=0;
		for(int index=num1;index<=num2;index++){			
			sum=sum+index;
		}
		System.out.println("Total of numbers is "+sum);
	}
	
	public static void main(String[] args){
		SumOfNumbers son = new SumOfNumbers();
		son.setNumber(1,100);
	}
}