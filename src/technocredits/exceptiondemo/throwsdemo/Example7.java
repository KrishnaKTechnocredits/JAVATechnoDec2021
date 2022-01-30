package technocredits.exceptiondemo.throwsdemo;

import java.io.File;
import java.io.FileInputStream;

public class Example7 {

	void m1() throws Exception {
		File file = new File("D://mmk.txt");
		FileInputStream stream = new FileInputStream(file);
	}
	
	void m2() throws Throwable{
		m1();
	}
	
	void m3() throws Throwable{
		m2();
	}
}
