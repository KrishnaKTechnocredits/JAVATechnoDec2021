package vaishnavi;

public class A25_MissingNumber {

	boolean flag = false;
	boolean findMissingNumber(int n,int[] num) {
		for(int index = 0; index < num.length; index++ ) {
			if(n==num[index]) {
				flag=true;
				break;
			}else {
				flag= false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A25_MissingNumber a25_MissingNumber = new A25_MissingNumber();
		int arr[]= {1, 2, 8, 10, 9, 5, 7, 6,4};
		for(int index = 1;index <arr.length; index++) {
			boolean flag=a25_MissingNumber.findMissingNumber(index,arr);
			if(!flag){
				System.out.println("Missing number is : " + index);
			}
		}
	}

}
