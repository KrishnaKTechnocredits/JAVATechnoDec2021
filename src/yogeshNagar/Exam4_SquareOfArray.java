package yogeshNagar;

public class Exam4_SquareOfArray {

	boolean getNextNumberSquareInArray(int[] arr) {
		boolean flag=false;
		for (int index = 0; index < arr.length - 1; index++) {
			int sqrInt = arr[index] * arr[index];
			if (sqrInt == arr[index + 1])
				flag= true;
			else
				flag=false;
		}
		if(flag==true)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Exam4_SquareOfArray sqrNumArr = new Exam4_SquareOfArray();
		int[] arr = { 2, 4, 16, 256 };
		System.out.println(sqrNumArr.getNextNumberSquareInArray(arr));
	}

}
