package nasir;

public class A29_FindNumber {
	static void findNumberFromString(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			String ans=input[index];
			try{
				int num=Integer.parseInt(ans);
			
			sum+=num;
			}catch(NumberFormatException ne) {
				
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		String input= "1 have 15 years 3 months of automation experince";
		String[] output=input.split(" ");
		A29_FindNumber.findNumberFromString(output);
		
	}
}
