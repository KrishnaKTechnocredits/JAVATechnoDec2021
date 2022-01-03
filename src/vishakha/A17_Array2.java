package vishakha;

public class A17_Array2 {
	String getMaxVowelsIsString(String[] input) {
		String maxString="";
		int maxCount = 0;
		for(int index=0; index<input.length;index++) {
			String currentName = input[index];
			int currentNameVowelCnt = 0;
			for(int innerindex=0;innerindex<currentName.length();innerindex++) {
				char ch = currentName.charAt(innerindex);
				if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
					currentNameVowelCnt++;
				if(currentNameVowelCnt>maxCount) {
					maxCount = currentNameVowelCnt;
					maxString= currentName;
					}
			}
		}
	return maxString;
	}
public static void main(String[] args) {
	String[] arr = {"hi", "priyanka", "sandip", "aakansha", "pallavi", "apurva"};
	A17_Array2 a17 = new A17_Array2();
	String str = a17.getMaxVowelsIsString(arr);
	System.out.println("String having maximum vowels from given array is :" + str);
}



}
