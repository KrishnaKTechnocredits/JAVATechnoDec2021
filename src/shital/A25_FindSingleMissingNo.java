package shital;

public class A25_FindSingleMissingNo {
	
	void getMissingNo(int[] number) {
		int num=number.length+1;
		int expNum =(num*(num+1)/2);
		
		for(int i=0;i<number.length;i++) {
			expNum -=number[i];
		}
		System.out.println("Missing Number is: "+expNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A25_FindSingleMissingNo findMissingNo=new A25_FindSingleMissingNo();
		int number[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		findMissingNo.getMissingNo(number);
	}
}
