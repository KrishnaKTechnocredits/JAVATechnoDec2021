package swati.Assignment12;

public class A12_Reverse {

	void revNum(int num) {
		int rev=0;
		while(num>0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_Reverse rev=new A12_Reverse();
		rev.revNum(123);
	}

}
