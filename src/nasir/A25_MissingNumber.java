package nasir;

public class A25_MissingNumber {
	void setNumber() {
		int[] number= {1,2,3,4,10,9,8,7,6};
		int n = number.length+1;
		int expSum= (n*(n+1)/2);
		for(int index=0; index<number.length;index++) {
			expSum=expSum-number[index];
		}
		System.out.println(expSum);
	}
	public static void main(String[] args) {
		A25_MissingNumber missingNumber = new A25_MissingNumber();
		missingNumber.setNumber();
	}
	
}
