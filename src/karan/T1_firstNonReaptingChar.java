package karan;

public class T1_firstNonReaptingChar {
	
	void display(String input){
		for(int i=0;i<input.length();i++) {
			
			boolean flag = true;
			
			for(int j=0; j<input.length();j++){
				if(i !=j && input.charAt(i) == input.charAt(j)) {
					flag= false;
				}
				
			}
			if(flag) {
				System.out.println("Char:" + input.charAt(i));
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1_firstNonReaptingChar firstNonReapting = new T1_firstNonReaptingChar();
		firstNonReapting.display("technocredits");
		
	}

}
