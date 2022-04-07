package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * 39. Write a program to return Union of two ArrayList without duplicates.
i/p1: {‘A’, ‘M’, ‘B’, ‘K’, ‘A’}
i/p2: {‘A’, ‘H’, ‘T’, ‘K’, ‘S’}
o/p : {‘A’, ‘M’, ‘B’, ‘K’, ‘H’, ‘T’, ‘S’}

 */
public class UnionOf2ArrayListWithoutDuplicateOcurrences {
	
	LinkedHashSet<Character> unionOf2ArrayListNoDuplicateOcurrenceV1(char[] ch1, char[] ch2){
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(char c : ch1) {
			if(!lhs.contains(c)) {
				lhs.add(c);
			}
		}
		for(char c : ch2) {
			if(!lhs.contains(c)) {
				lhs.add(c);
			}
		}
		return lhs;
	}
	
	LinkedHashSet<Character> unionOf2ArrayListNoDuplicateOcurrenceV2(char[] ch1, char[] ch2){
		ArrayList<Character> arl1 = new ArrayList<>();
		ArrayList<Character> arl2 = new ArrayList<>();
		for(char c : ch1) {
			arl1.add(c);
		}
		for(char c : ch2) {
			arl2.add(c);
		}
		arl1.addAll(arl2);
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>(arl1);
		return lhs;	
	}
	
	public static void main(String[] a) {
		char[] c1 = {'A','M','B','K','A'};
		char[] c2 = {'A','H','T','K','S'};
		UnionOf2ArrayListWithoutDuplicateOcurrences union = new UnionOf2ArrayListWithoutDuplicateOcurrences();
		System.out.println("Input 1: "+Arrays.toString(c1)+"\nInput 2: "+Arrays.toString(c2));
		System.out.println("********without converting to ArrayList********");
		System.out.println("Union of two Arrays without duplicates."+union.unionOf2ArrayListNoDuplicateOcurrenceV1(c1, c2));
		System.out.println("\n********After converting to ArrayList********");
		System.out.println("Union of two ArrayList without duplicates."+union.unionOf2ArrayListNoDuplicateOcurrenceV2(c1, c2));
	}
}
