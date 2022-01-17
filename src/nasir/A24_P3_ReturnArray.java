package nasir;
//WAP to retrun array of words containing only digit
public class A24_P3_ReturnArray {
	void processData(String input) {
		
		String[] ans=input.split(" ");
		String[] output =new String[ans.length];
		for(int index=0; index<ans.length;index++) {
			String output1=ans[index];
			String name=filterDigit(output1);
			System.out.println(name);
		}		
	}
	
	String filterDigit(String digit) {
		String temp=" ";
		for(int index=0; index<digit.length();index++) {
			char ch = digit.charAt(index);
			if(Character.isDigit(ch))
				temp=temp+ch;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_P3_ReturnArray returnArray = new A24_P3_ReturnArray();
		returnArray.processData("Te1c2h C94re3");
	}
}
