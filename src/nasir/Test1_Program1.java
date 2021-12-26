package nasir;

public class Test1_Program1 {
	
	void setString(String input) {
		for(int index=0;index<input.length();index++) {
			int count=0;
			for(int index1=0;index1<input.length();index1++) {
				if(input.charAt(index1)==input.charAt(index))
					count++;
			}
			if(count==1) {
				System.out.println(input.charAt(index));		
			break;
			}
	}
	}							
	
	public static void main(String[] args) {
		Test1_Program1 testProgram1 =new Test1_Program1();
		testProgram1.setString("technocredits");
	}
}
