package nasir;
//WAP to reverse the case of each character in given word
public class A24_P7_ReverseCaseOfEachLetter {
	String temp=" ";
	void setData(String input) {
		boolean flag=true;
		for(int index=0; index<input.length();index++) {
			char ch=input.charAt(index);
			String ans= ch+"";
			if(ans.toUpperCase()==ans) 
				ans =ans.toLowerCase();			
			else if(ans.toLowerCase()==ans)
				ans=ans.toUpperCase();
			    temp=temp+ans;
		}
		temp=temp.trim();
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		A24_P7_ReverseCaseOfEachLetter reverseCaseOfEachLetter = new A24_P7_ReverseCaseOfEachLetter();
		reverseCaseOfEachLetter.setData("TeCHnoCReditS");
	}
}
