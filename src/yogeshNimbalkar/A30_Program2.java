package yogeshNimbalkar;

public class A30_Program2 {

	static int counter=0;
	
	int[] getUniqueNumberArr(int[] arr) {
		int[] temp = new int[arr.length];
		int innerIndex;
		for(int index=0; index<arr.length; index++) {
			for(innerIndex=0; innerIndex<index; innerIndex++) {
				if(arr[index] == arr[innerIndex])
					break;
			}
			if(index == innerIndex) {
				temp[counter++] = arr[index];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] input = {1,9,1,2,0,9,4,2,3};
		int[] temp = new int[input.length];
		A30_Program2 program2 = new A30_Program2();
		temp = program2.getUniqueNumberArr(input);
		for(int i=0; i< counter; i++)
			System.out.print(temp[i] + " ");
	}
}
