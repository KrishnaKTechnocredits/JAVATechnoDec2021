package shital;

public class A23_FindSecondMax {

	public void getSecondMaxNumber(int[] number) {
		int firstMax=0;
		int secondMax=0;
		for(int i=0;i<number.length;i++)
		if(firstMax < number[i]) {
			firstMax=number[i];
		}
		else if(firstMax > number[i] && number[i] > secondMax){
			secondMax=number[i];
		}
		System.out.println("First Max Number is :"+firstMax);
		System.out.println("Second Max Number is :"+secondMax);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_FindSecondMax findSecondMax=new A23_FindSecondMax();
		int[] input={1,11,3,99,66,54,22,44};
		findSecondMax.getSecondMaxNumber(input);
	}

}
