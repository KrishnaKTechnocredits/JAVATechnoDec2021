package shital;

class A17_MaxVowelFromArray{

	int findMaxVowel(String name){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)=='a' ||name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o'|| name.charAt(index)=='u'){
				count++;
			}	
		}
		System.out.println("Count of Vowel : "+name+"-"+count);
		return count;		
	}
	
	String getVowel(String[] arr){
		int maxCount=0;
		String maxString="";
		int cnt=0;
		for(int index=0;index<arr.length;index++){
			String name = arr[index].toLowerCase();
			cnt=findMaxVowel(name);
			if(cnt > maxCount){
				maxCount=cnt;
				maxString=name;
			}
		}
		System.out.println("\nMax String is: "+maxString);
		return maxString;
	}
	
	public static void main(String[] args){
		A17_MaxVowelFromArray maxVowelFromArray=new A17_MaxVowelFromArray();
		String[] arr={"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		maxVowelFromArray.getVowel(arr);
	}
}
