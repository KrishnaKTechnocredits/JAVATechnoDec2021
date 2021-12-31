package tanu;
class TestProgram1{
	void nonRepeatCharString(String name) {
		int index=0;
		char first;
		char next;

		for(index=0; index<name.length(); index++ ) {
			boolean nonRepeat=false;
			first = name.charAt(index);		
			for(int num=index+1; num<name.length(); num++) {
				next = name.charAt(num);
				if(first == next)
				{
					nonRepeat = true;
					break;
				}
				}
			if(nonRepeat == false)
			{
				System.out.println(name.charAt(index) + " is first non repeating");
				break;
			}
		}


	}
	
public static void main(String[] arg) {
	TestProgram1 testprogram  = new TestProgram1();
	testprogram.nonRepeatCharString("technocredit");
}	
	
}