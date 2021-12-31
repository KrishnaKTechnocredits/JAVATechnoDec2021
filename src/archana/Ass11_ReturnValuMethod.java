package archana;

public class Ass11_ReturnValuMethod {
	
	int  FirstOccurance(String name , char ch ,boolean flag) {
		int index =0;
		for ( ;index < name.length();index++) {
			if(name.charAt(index)== ch) {
				flag=true;
				break;
			}
		}
		return index+1;
	
	}
	int  LastOccurance(String name , char ch , int cnt) {
		int index = 0;	
		
		for ( ;index < name.length();index++) {	
			
			if(name.charAt(index)== ch) {
					cnt = index;	
			}
			
		}
		return cnt+1;
	
	}
	
	boolean  FirstOccuranceTrue(String name , char ch ,boolean flag) {
		int index =0;
		for ( ;index < name.length();index++) {
			if(name.charAt(index)== ch) {
				flag = true;
				break;
			}
		}
		return flag;
	
	}
	int  TotalOccurance(String name , char ch ,int cnt) {
		int index =0;
		for ( ;index < name.length();index++) {
			if(name.charAt(index)== ch) {
				cnt ++;				
			}
		}
		return cnt;	
	}
	public static void main(String[] args) {
		Ass11_ReturnValuMethod ass11= new Ass11_ReturnValuMethod();
		int FstOccChar = ass11.FirstOccurance("archana",'a',false);
		System.out.println("First occurance of character 'a' in string : archana is : "+ FstOccChar + "-st position");
		System.out.println("--------------------------------------------------------------------------------------");
		int LstOccChar = ass11.LastOccurance("archana",'a',0);
		System.out.println("Last occurance of character 'a' in string : archana is : "+ LstOccChar + "-st position");
		System.out.println("--------------------------------------------------------------------------------------");
		boolean tFlag = ass11.FirstOccuranceTrue("archana",'a',false);
		System.out.println("character a is found in given string  : "+ tFlag);
		System.out.println("--------------------------------------------------------------------------------------");
		int totalOccu = ass11.TotalOccurance("archana",'a',0);
		System.out.println("character a found in given string  : "+ totalOccu + " times");
	}	
	

}
