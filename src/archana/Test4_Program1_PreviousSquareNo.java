package archana;

public class Test4_Program1_PreviousSquareNo {

	static void checkPreviousSquareNo(int[] arrNum) {
        
		for (int i = 0; i < arrNum.length-2; i++) {
			int squareNum = arrNum[i] * arrNum[i];
			if (squareNum == arrNum[i+1] ) {
				System.out.println(squareNum + " is a square of " + arrNum[i]  );
			}
		}
	}

	public static void main(String[] args) {
		int[] arrNum = { 2, 4, 16, 256 };
		Test4_Program1_PreviousSquareNo.checkPreviousSquareNo(arrNum);
	}

}
