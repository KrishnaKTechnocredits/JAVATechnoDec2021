package priyankaZende;
public class FindFrequencyOfCharDemo {
	void findFreqChar(String name, char ch){
		int count =0;
		for(int index=0;index<name.length(); index++){
			if(name.charAt(index) == ch )
				count++;
		}
	    System.out.println(count);
}
	public static void main(String[] args) {
		FindFrequencyOfCharDemo findFrequencyChar = new FindFrequencyOfCharDemo();
		findFrequencyChar.findFreqChar("technocredits", 't');
	}
}
