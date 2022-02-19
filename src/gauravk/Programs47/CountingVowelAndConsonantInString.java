package gauravk.Programs47;
import java.util.ArrayList;

/*
 * 14.How to calculate the number of vowels and consonants in a string
i/p : maulik
o/p : vowels: 3, consonants : 3
 */
public class CountingVowelAndConsonantInString {
	
	void countVowelAndConsonant(String str) {
		char[] ch = str.toCharArray();
		ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		ArrayList<Character> arl1 = new ArrayList<>();
		for(char c : ch) {
			arl1.add(c);
		}
		ArrayList<Character> arl2 = new ArrayList<>(arl1);
		
		findingConsonants(arl1, vowels);
		findingVowels(arl2, vowels);
	}
	
	void findingConsonants(ArrayList<Character> arl, ArrayList<Character> vow) {
		arl.removeAll(vow);
		System.out.println("Consonants are : "+arl+" Total "+arl.size()+" consonants.");
	}
	
	void findingVowels(ArrayList<Character> arl, ArrayList<Character> vow) {
		arl.retainAll(vow);
		System.out.println("Vowels are : "+arl+" Total "+arl.size()+" vowels.");
	}
	
	
	public static void main(String[] args) {
		String s = "maulik";
		CountingVowelAndConsonantInString vc = new CountingVowelAndConsonantInString();
		vc.countVowelAndConsonant(s);
	}
}
