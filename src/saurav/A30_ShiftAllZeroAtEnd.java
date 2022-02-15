package saurav;

public class A30_ShiftAllZeroAtEnd {
	
	static void shiftZero(int[] input) {
		int[] intArr = new int [input.length];
		int cnt = 0;
		for(int index = 0; index<input.length; index++) {
			if(input[index]!=0) {
				intArr[cnt] = input[index];
				cnt++;
			}
		}
		for (int index = 0; index<input.length; index++)
			System.out.print(intArr[index]+" ");
	}
	
	public static void main(String[] args) {
	int	input[] = {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
	A30_ShiftAllZeroAtEnd.shiftZero(input);
	}
}
