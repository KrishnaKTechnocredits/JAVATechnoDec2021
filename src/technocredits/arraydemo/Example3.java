package technocredits.arraydemo;

public class Example3 {

	int count = 0;
	
	void findCharCountFromString(String name, char ch) {
		int cnt = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch) {
				count++;
				cnt++;
			}
		}
		System.out.println(name + " --> " + cnt);
	}
	
	
	void findCharCountFromArray(String[] input, char ch) {
		for(int index=0;index<input.length;index++) {
			findCharCountFromString(input[index], ch);
		}
		System.out.println(count);
	}	
	
	public static void main(String[] args) {
		String[] name = {"Technocredits", "Dimple", "Vivek", "Sandeep"};
		new Example3().findCharCountFromArray(name, 'e');
	}
}
