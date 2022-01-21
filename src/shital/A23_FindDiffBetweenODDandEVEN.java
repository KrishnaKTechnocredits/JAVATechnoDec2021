package shital;

public class A23_FindDiffBetweenODDandEVEN {

	void getDiff(String str) {
		int num=0;
		int even=0;
		int odd=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				num =Character.getNumericValue(ch);
				//System.out.println("Found below Digit :"+num);
				 if(num%2==0) {
					 even=even+num;
				 }
				 else {
					 odd=odd+num;
				 }
			}	
		}
		int ans=odd-even;
		System.out.println("Sum of even No is :"+even);
		System.out.println("Sum of Odd No is :"+odd);
		System.out.println("diff between even and Odd :"+ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_FindDiffBetweenODDandEVEN findDiffBetweenODDandEVEN =new A23_FindDiffBetweenODDandEVEN();
		String sample="tec5hno3cre6di1ts";
		findDiffBetweenODDandEVEN.getDiff(sample);
	}
}
