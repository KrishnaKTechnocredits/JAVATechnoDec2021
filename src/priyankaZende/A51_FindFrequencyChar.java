package priyankaZende;
public class A51_FindFrequencyChar {
	void findFreqChar(String name, char ch){
		int count =0;
		for(int index=0;index<name.length(); index++){
			if(name.charAt(index) == ch )
				count++;
		}
	    System.out.println(count);
}
	public static void main(String[] args) {
		A51_FindFrequencyChar findFrequencyChar = new A51_FindFrequencyChar();
		findFrequencyChar.findFreqChar("technocredits", 't');
	}
}
