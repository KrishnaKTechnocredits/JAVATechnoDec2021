package shital;

class A15_CountOfPositiveNumber{

	int findCountOfPositiveNumber(int[] number){
		int count=0;
		for(int index=0;index<number.length;index++){
			if(number[index]>0){
				count++;
			}
		}
		System.out.println("Count of Positive Number is: "+count);
		return count;
	}
	
	public static void main(String[] args){
		A15_CountOfPositiveNumber countOfPositiveNumber=new A15_CountOfPositiveNumber();
		int[] number={12,-11,99,11,23,-44};
		countOfPositiveNumber.findCountOfPositiveNumber(number);
	}

}