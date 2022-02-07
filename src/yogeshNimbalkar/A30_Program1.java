package yogeshNimbalkar;

public class A30_Program1 {

	int[] getZeroAtEnd(int[] arr) {
		int[] temp = new int[arr.length];
		int count=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != 0) {
				temp[count] = arr[index];
				count++;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] input = {0,3,4,6,0,2,0,1};
		A30_Program1 program1 = new A30_Program1();
		int[] temp= new int[input.length];
		temp = program1.getZeroAtEnd(input);
		for(int i : temp)
			System.out.print(i + " ");
	}
}
