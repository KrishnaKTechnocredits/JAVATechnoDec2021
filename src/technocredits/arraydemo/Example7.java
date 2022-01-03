package technocredits.arraydemo;

public class Example7 {

	public static void main(String[] args) {
		int[] num = {10,13,3,45,46,42,99,110,11};
		for(int index=0;index<num.length-1;index++) {
			if(num[index] > num[index+1]) {
				System.out.println(num[index]);
			}
		}
	}
}
