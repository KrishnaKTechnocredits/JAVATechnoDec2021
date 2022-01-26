package nishika;

public class A_25 {
	
	void findSingleMissingNum(int[] num) {
		int n = num.length + 1;
		int total = (n*(n + 1 ) /2);
		
		for(int i=0; i<num.length; i++) {
			total=total-num[i];
		}System.out.println(total);
	}
	
	public static void main(String[] args) {
		
		A_25 a_25 = new A_25();
		int[] num = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		a_25.findSingleMissingNum(num);
	}
}
