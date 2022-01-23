package technocredits;

public class MissingNumber {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 10, 9, 5, 7, 6, 4 };
//		Multiple
//		
//		int avaNum[] = new int[num.length];//{0,0,0,0,0,0,0}
//		for(int i =0;i<avaNum.length;i++) {
//			avaNum[i] = num[i];
//		}
//		
//		for() {
//		if(avaNum[i]==0) {
//			System.out.println(i);
//		}}

		int n = num.length + 1;
		int expSum = (n * (n + 1) / 2);

		for (int i = 0; i < num.length; i++) {
			expSum = expSum - num[i];
		}
		System.out.println(expSum);
	}

}
