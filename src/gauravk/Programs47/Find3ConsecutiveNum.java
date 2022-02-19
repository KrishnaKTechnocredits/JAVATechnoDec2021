package gauravk.Programs47;
/*
 * 27.Write a program that prints "techno" when three consecutive numbers appear
i/p : {12,13,15,14,17,18,19,20}
o/p : techno
 */
public class Find3ConsecutiveNum {
	
	void threeConsecuriveNum(int[] num) {
		String stamp = "techno";
		for(int i=0; i<num.length-2; i++) {
			if(num[i+1]==num[i]+1 && num[i+2]==num[i]+2) {
				System.out.println(num[i]+","+num[i+1]+","+num[i+2]+" ---> "+stamp);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = {12,13,15,14,17,18,19,20};
		Find3ConsecutiveNum conNum = new Find3ConsecutiveNum();
		System.out.println("prints 'techno' when three consecutive numbers appear");
		conNum.threeConsecuriveNum(input);
	}
}
