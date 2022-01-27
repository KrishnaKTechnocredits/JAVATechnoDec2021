package shital;

public class A29 {
	
	void getDigitFromString(String str) {
		int sum=0;
		int num=0;
		String[] arr=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			String word=arr[index];
			try {
				 num=Integer.parseInt(word);
				 sum=sum+num;
			}
			catch(Exception ae){
				System.out.println(word);
			}
		}
		System.out.println("\nSum is: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A29 a29=new A29();
		String str="I have 15 years and 3 months of automation experience";
		a29.getDigitFromString(str);
	}
}
