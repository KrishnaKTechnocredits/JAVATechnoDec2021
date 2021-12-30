package shital;

class A15_MinNumber{

	void findMinNumber(int[] number){
		int min=number[0];
		for(int index=1;index<number.length;index++){
			if(min>number[index])
				min=number[index];
		}
		System.out.println("\nMinimum Number is: "+min);
	}
	
	public static void main(String[] args){
		A15_MinNumber minNumber=new A15_MinNumber();
		int[] number={58,12,96,13,450,69,34,71,8,89};
		minNumber.findMinNumber(number);
	}

}