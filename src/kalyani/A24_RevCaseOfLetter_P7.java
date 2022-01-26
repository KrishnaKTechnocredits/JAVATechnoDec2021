package kalyani;

public class A24_RevCaseOfLetter_P7 {
	
	String temp=" ";
	
	void processData(String input) {
		
		for(int index=0; index<input.length();index++) {
			char ch=input.charAt(index);
			String output= ch+"";
			if(output.toUpperCase()==output) 
				output =output.toLowerCase();			
			else if(output.toLowerCase()==output)
				output=output.toUpperCase();
			
			temp=temp+output;
		}
		
		temp=temp.trim();
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_RevCaseOfLetter_P7 assign24 = new A24_RevCaseOfLetter_P7();
		assign24.processData("TeCHnoCReditS");
	}
}