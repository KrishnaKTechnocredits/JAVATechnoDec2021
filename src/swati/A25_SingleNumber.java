package swati;

public class A25_SingleNumber {
	boolean flag=false;
 boolean findMissing(int n, int[]num) {
			for(int i=0;i<num.length;i++) {
				if(n==num[i]) {
				flag=true;
				break;
				}
				else {
					flag=false;
				}
			}
			return flag;
		}
	public static void main(String[] args) {
		A25_SingleNumber n=new A25_SingleNumber();
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6,4};
		for(int i=1;i<num.length;i++) {
			boolean flag=n.findMissing(i, num);
			if(!flag) {
				System.out.println(i + " is missing");
			}
		}
	}

}
