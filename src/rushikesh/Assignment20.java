package rushikesh;

public class Assignment20 {
	int num=0;
	void addNum(String str) {
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) 
				num+=Character.getNumericValue(ch);		
		}
		System.out.println(num);	
	}
	public static void main(String[] args) {
		Assignment20 assign20=new Assignment20();
		assign20.addNum("TE1ch2noC2red9iTs");
	}
}
