package hevin;

public class Exam3_GetMaxDigit {
	
	void findMaxDigit(int[] Array) {
		
		int maxNum = Array[0];
		
		for (int num : Array) {
			if (num > maxNum)
				maxNum = num;
		}
		System.out.println("Max Digit  --> " + maxNum);
	}
	
	public static void main(String[] args) {
		Exam3_GetMaxDigit exam3 = new Exam3_GetMaxDigit();
		int[] Array = {6,8,3,2,7,7,4};
		exam3.findMaxDigit(Array);
		
	}

}
