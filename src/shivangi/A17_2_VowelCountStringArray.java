package shivangi;

public class A17_2_VowelCountStringArray {
	
	void findMaxVowelString(String[] name){
		int maxCount = 0;
		String maxVowelString = "";
		for(int index=0; index<name.length; index++){
			String currentName = name[index];
			int currentNameVowelCount = 0;
			for(int innerIndex=0; innerIndex<currentName.length(); innerIndex++){
				char ch = currentName.charAt(index);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					currentNameVowelCount++;
				}
				
			}
			if(currentNameVowelCount > maxCount){
				maxCount = currentNameVowelCount;
				maxVowelString = currentName;
			}
		}
		System.out.println(maxCount + "-->" + maxVowelString);
	}
	
	public static void main(String[] args){
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		A17_2_VowelCountStringArray a17_2_VowelCountStringArray = new A17_2_VowelCountStringArray();
		a17_2_VowelCountStringArray.findMaxVowelString(arr);
	}
}
