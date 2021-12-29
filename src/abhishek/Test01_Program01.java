package abhishek;
class Test01_Program01 {
	void getOccurrence(String input) {
		int i,count=0;
		for (int index = 0; index < input.length(); index++) {	
			i=0;
			count=0;
			for(;i<input.length();i++){
				if (input.charAt(index) == input.charAt(i)){ 
					count++;
					}
					
			}
			if (count == 1){
			System.out.println("Character "+input.charAt(index)+" first non repeating in input string " + input );
			break;
			}			
		}
		
	}
	
public static void main(String[] a) {
		Test01_Program01 test01_Program01 = new Test01_Program01();	
		test01_Program01.getOccurrence("technocredits");	
}
			}