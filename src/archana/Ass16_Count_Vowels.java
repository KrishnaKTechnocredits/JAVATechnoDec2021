package archana;

public class Ass16_Count_Vowels {
	int count = 0;
	String collection;
	int totalVowels = 0;

	void countOfVowels(String[] name) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int index = 0; index < name.length; index++) { //Names

			String strName = name[index];

			for (int i = 0; i < strName.length(); i++) {//Name length

				for (int v = 0; v < vowels.length; v++) {//Vowels

					if (strName.charAt(i) == vowels[v]) {

						count++;

					}

				}

			}
			System.out.println(strName + "->" + count);
			totalVowels = totalVowels + count;
			count = 0;
		}
		System.out.println("Total vowels in array String :" + totalVowels);
	}

	public static void main(String[] args) {
		Ass16_Count_Vowels ass16 = new Ass16_Count_Vowels();
		String[] name = { "priyanka", "swati", "acharya", "hevin" };
		System.out.println("Name with vowels count :");
		ass16.countOfVowels(name);

	}
}
