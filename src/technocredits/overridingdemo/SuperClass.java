package technocredits.overridingdemo;

import java.io.IOException;

/*Exception Handling in Overriding:
	For unchecked exceptions, there is no rule.
	There are 3 basic rules to remember.
		1. If Parent class method is not throwing any exception, then child class overridden method should also not throw any checked exception.
		2. If Parent class method is throwing any exception, then child class overridden have 3 option:
			i. Child class overridden method does not throw any exception.
			ii. Child class overridden method throws same exception as of parent class method.
Child class overridden method throws child exception of parent class method's exception.
*/
public class SuperClass {

	void m1() throws IOException{
		
	}
}
