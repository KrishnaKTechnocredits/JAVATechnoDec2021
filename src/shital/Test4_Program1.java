package shital;

public class ProgTest_FindNextNoisSquareofPreviousNo {
	
	void getSequareNowithPreviousNo(int[] arrNum) {
		for (int i = 0; i < arrNum.length-1; i++) {
			int squareNum = arrNum[i] * arrNum[i];
				
				if (squareNum == arrNum[i+1]) {
					System.out.println(squareNum + " is a square of " + arrNum[i] );
				}
				else 
					System.out.println("Incorrect sequence");
			}		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgTest_FindNextNoisSquareofPreviousNo progTest_FindNextNoisSquareofPreviousNo=new ProgTest_FindNextNoisSquareofPreviousNo();
		int[] input={2,4,16,256};
		progTest_FindNextNoisSquareofPreviousNo.getSequareNowithPreviousNo(input);
	}

}
