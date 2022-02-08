package rohini.Rohini_Assignment24;

/*
3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"*/

public class Program3 {
	
	public void Digit(String string) {
		String[] stringarr=string.split(" ");
		
		for(int index=0;index<stringarr.length;index++) {
			String temp="";
			for(int index1=0;index1<stringarr[index].length();index1++) {
				char ch=stringarr[index].charAt(index1);
				if(Character.isDigit(ch)) {
					temp=temp+ch;
				}
				
			}System.out.println(temp);
		}
		
			
		}
		
		
	

	public static void main(String[] args) {
		Program3 prg3=new Program3();
		prg3.Digit("Te1c2h C94re3");
		
		
	}

}
