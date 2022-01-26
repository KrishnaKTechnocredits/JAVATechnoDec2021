package shital;

public class A23_FindDiffEVENandODD {

	void getDiffEVENandODD(String str) {
		String temp="";
		int even=0;
		int odd=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			if((temp!="" && Character.isLetter(ch))|| i==str.length()-1) {
				int num=Integer.parseInt(temp);
				System.out.println("Digit is : "+temp);
				if(num%2==0) {
					even=even+num;
				}
				else {
					odd=odd=num;
				}
				temp="";
			}
		}
		int ans=even-odd;
		System.out.println("\neven No Addition is ="+even);
		System.out.println("Odd No Addition is ="+odd);
		System.out.println("\nDiifference between Even and Odd is: "+ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_FindDiffEVENandODD findDiffEVENandODD=new A23_FindDiffEVENandODD();
		String sample="te112ch34no29";
		findDiffEVENandODD.getDiffEVENandODD(sample);
	}

}
