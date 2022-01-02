package technocredits.arraydemo;

public class Example8 {

	String getMaxVowelString(String[] name)
	{
		int maxCount = 0;
		String maxVowelString = "";
		
		for(int index=0;index<name.length;index++) {
			String currentName = name[index];
			int currentNameVowelCount = 0;
			//// Inner for loop : to find number of vowels in currentname
			if(currentNameVowelCount > maxCount) {
				maxCount = currentNameVowelCount;
				maxVowelString = currentName;
			}
		}
		String ans = maxVowelString + "-" + maxCount;
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		// 13,14,15 14,15,16 22,23,24
		
		
	}
}
