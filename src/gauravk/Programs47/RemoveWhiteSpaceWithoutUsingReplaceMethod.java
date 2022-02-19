package gauravk.Programs47;
/*
 *  Remove all white space without using replace method.
String str = “You are from technocredits dec2021 batch”
 */
public class RemoveWhiteSpaceWithoutUsingReplaceMethod {
	
	void removeWhiteSpace(String str1) {
		char [] ch = str1.toCharArray();
		String result = "";
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!=' ') {
				result = result + ch[i];
			}
		}
		System.out.println(result);
	}
		
	public static void main(String[] args) {
		String s1 = "You are from technocredits dec2021 batch";
		
		RemoveWhiteSpaceWithoutUsingReplaceMethod c1 = new RemoveWhiteSpaceWithoutUsingReplaceMethod();
		c1.removeWhiteSpace(s1);;
	}
}