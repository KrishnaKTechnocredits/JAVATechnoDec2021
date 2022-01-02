package swati.Swati_Assignment17;

public class A17_FindVowel {

	void getMaxVowel(String[] name) {
		int maxCount=0;
		String maxName="";

		for (int i = 0; i < name.length; i++) {
			int count = 0;
			int tempCount=0;
			String tempName="";
			String arrName = name[i];

			for (int j = 0; j < arrName.length(); j++) {

				if (arrName.charAt(j) == 'a' || arrName.charAt(j) == 'e' || arrName.charAt(j) == 'i'|| arrName.charAt(j) == 'o'|| arrName.charAt(j) == 'u') {
					count++;
					tempCount=count;
				}

			}
			if(tempCount>maxCount) {
				maxCount=tempCount;
				maxName=arrName;
			}
			
			//System.out.println("Count of character " + arrName + " is " + count);

		}
		System.out.println(maxName + " is name with maximum vowels "   +maxCount);
	}

	public static void main(String[] args) {

		String[] name = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		A17_FindVowel a17 = new A17_FindVowel();
		a17.getMaxVowel(name);

	}

}
