package technocredits.arraydemo;

public class Example4 {

	int getCharCountFromString(String name, char ch) {
		int cnt = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch) {
				cnt++;
			}
		}
		System.out.println(name + " --> " + cnt);
		return cnt;
	}
	
	
	void findCharCountFromArray(String[] input, char ch) {
		int count = 0;
		for(int index=0;index<input.length;index++) {
			int temp = getCharCountFromString(input[index], ch);
			//System.out.println(input[index] + " --> " + temp);
			count += temp;
		}
		System.out.println(count);
	}	
	
	public static void main(String[] args) {
		String[] name = {"Technocredits", "Dimple", "Vivek", "Sandeep"};
		new Example4().findCharCountFromArray(name, 'e');
	}
}
