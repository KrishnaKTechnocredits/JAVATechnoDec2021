package swati.Swati_Exam4;

public class Exam4_Square {
	
	boolean findSqrt(int[] num) {
		boolean flag=false;
		for(int i=0;i<num.length-1;i++) {
			int prev=num[i];
			int next=num[i+1];
			prev=prev*prev;
			if(prev==next) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Exam4_Square eg = new Exam4_Square();
		int[] input = { 2, 4, 16, 256 };
		boolean flag = eg.findSqrt(input);
		if (flag) {
			System.out.println("True");
		} else {

			System.out.println("false");
		}
	}

}