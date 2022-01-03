package hevin;

class A17_MaxVowelsWord {

	void findMaxVowelsFromArray(String[] input){
		String name = " ";
		int cnt=0;
		
		for(int index=0; index<input.length;index++){
			String temp =input[index];
			int count=0;	
			
			for(int innerIndex=0; innerIndex<temp.length();innerIndex++){
			    char ch=temp.charAt(innerIndex);
				if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
					count++;
			}
			System.out.println("*" +temp+ " Total count of Vowles --> " +count);
				if(count>cnt){
				cnt=count;
				name=temp;
		}
		}
		System.out.println("-->Name of Maximum Count of Vowels : "+name);
	}

	public static void main(String[]args){
		A17_MaxVowelsWord maxvowels = new A17_MaxVowelsWord();
		String[] name = {"hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		maxvowels.findMaxVowelsFromArray(name);
	}
} 