package rushikesh;

/*Assignment-29 : 25th Jan'2022
WAP to find out the total sum of all the numbers present in the given string without using
Character class method.
Input  : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 18
Hint   : Using exception handling (i.e. try catch block).
*/
public class Assign29 {
	void sumOfNumFromString(String str) {
		int sum=0;
		String [] arr=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			try {
				int num=Integer.parseInt(arr[index]);
				sum+=num;
			}catch(NumberFormatException ne) {	
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Assign29 assign29=new Assign29();
		String Input = "I have 15 years and 3 months of automation experience";
		assign29.sumOfNumFromString(Input);
	}
}
