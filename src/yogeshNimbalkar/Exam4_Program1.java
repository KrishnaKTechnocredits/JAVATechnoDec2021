package yogeshNimbalkar;

public class Exam4_Program1 {

	boolean isNextNumSquare(int[] arr) {
		boolean flag = true;
		if(arr.length >= 2) {
			for(int index=0; index<arr.length-1; index++) {
				if(arr[index+1] != (arr[index] * arr[index])) {
					flag = false;
					break;
				}
			}			
		}
		else {
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Exam4_Program1 program1 = new Exam4_Program1();
		int[] input = {2,4,16};
		System.out.println("Is each number is a square of previous number : " + program1.isNextNumSquare(input));
	}
}
