package shital;

class A15_SumOfAllEvenPositiveNuumbers{
	
	
	void findSumOfEvenNumber(int[] number){
		int sum=0;
		for(int index=0;index<number.length;index++){
			if(number[index]>0){
				if(number[index]%2==0){
					sum=sum+number[index];
				}
			}
		}
		
		System.out.println("Sum is: "+sum);
	}
	public static void main(String[] args){
		A15_SumOfAllEvenPositiveNuumbers sumOfEvenNumber=new A15_SumOfAllEvenPositiveNuumbers();
		int[] number={10,13, -14, -20, 22, 3};
		sumOfEvenNumber.findSumOfEvenNumber(number);
	}

}