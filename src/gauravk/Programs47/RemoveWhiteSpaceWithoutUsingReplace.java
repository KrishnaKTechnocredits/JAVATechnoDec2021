package gauravk.Programs47;
/*
 * 23.How to remove Whitespaces from String without using replace or replaceAll.
Hint Use StringBuffer or StringBuilder
i/p : I love my india
o/p : ilovemyindia
 */
public class RemoveWhiteSpaceWithoutUsingReplace {
	
	String removeWhiteSpaceWithoutReplaceMethod(String str) {
		StringBuffer sb = new StringBuffer(str.trim());
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)==' ') {
				sb.deleteCharAt(i);
				i=i-1;
			}
		}
		return new String(sb);
	}
	
	public static void main(String [] args) {
		String s1 = " i   love my india";
		RemoveWhiteSpaceWithoutUsingReplace removeSpace = new RemoveWhiteSpaceWithoutUsingReplace();
		System.out.println("The sentence: '"+s1+"'\nis processed and white spaces removed. \nResult:"+removeSpace.removeWhiteSpaceWithoutReplaceMethod(s1));
	}
}
