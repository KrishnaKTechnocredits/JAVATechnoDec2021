package debasmita;

public class A17_MaxVowels {
	
	int getMaxVowel(String name) {
		int cnt=0;
		for(int index=0;index<name.length(); index++) {
		  if(name.charAt(index)=='a'||name.charAt(index)=='e'||name.charAt(index)=='i'||name.charAt(index)=='o'||name.charAt(index)=='u') {
			cnt++;
		  }
		}
		   return cnt;
	}
	String totalVowelsInString(String[] name) {
		String maxname="";
		int maxcnt=0;
		for(int i=0;i<name.length;i++) {
			int temp=getMaxVowel(name[i]);
			if(temp>maxcnt) {
				maxcnt=temp;
				maxname=name[i];
			}
		}
		      return maxname;  
	}

	public static void main(String[] args) {
		
		A17_MaxVowels vowels=new A17_MaxVowels();
		String arr[] ={"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		String s=vowels.totalVowelsInString(arr);
		System.out.println(s);
		}
}
