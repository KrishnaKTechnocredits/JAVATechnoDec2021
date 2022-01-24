package nishika;

public class A_14 {
	
	void findCount(String input){
		char ch = ' ';
		int duplicateCount = 0;
		int uniqueCount = 0;
		
		for(int index=0; index<input.length(); index++){
			ch = input.charAt(index);
			if(index == input.indexOf(ch)){
				if(input.indexOf(ch) != input.lastIndexOf(ch)){
					duplicateCount++;
				}
			}
			if(input.indexOf(ch) == input.lastIndexOf(ch)){
				uniqueCount++;
			}
		}
		
		//System.out.println("Duplicate characters count is : " + duplicateCount);
		//System.out.println("Unique characters count is : " + uniqueCount);
		
		if(duplicateCount > uniqueCount){
			System.out.println("Java");
		}else{
			System.out.println("Selenium");
		}
	}
	
	public static void main(String[] args){
		A_14 a14 = new A_14();
		a14.findCount("technocredits");
	}
}
