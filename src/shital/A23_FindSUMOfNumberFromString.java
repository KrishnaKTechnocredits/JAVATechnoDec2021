package shital;

public class A23_FindSUMOfNumberFromString {
	
	void findSum(String name) {
		int sum=0;
		String temp="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			if((temp!="" && Character.isLetter(ch))|| i==name.length()-1) {
				sum=sum+Integer.parseInt(temp);
				System.out.println("Digit is : "+temp);
				temp="";
			}
		}
		System.out.println("Sum of all Numbers is:"+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_FindSUMOfNumberFromString findSUMOfNUmberFromString=new A23_FindSUMOfNumberFromString();
		findSUMOfNUmberFromString.findSum("te12ch22nocre3dits4");
	}
}
