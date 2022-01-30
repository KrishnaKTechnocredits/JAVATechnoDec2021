package technocredits.exceptiondemo.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example5 {

	void m1() throws FileNotFoundException{
		File file = new File("D://mmk.txt");
		try {
			FileInputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			//File file1 = new File("D://mmk1.txt");
			//FileInputStream inputStream = new FileInputStream(file1);
		}
	}
}
