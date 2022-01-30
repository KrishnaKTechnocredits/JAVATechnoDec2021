package technocredits.exceptiondemo.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example6 {

	void m1() throws IOException{
		File file = new File("D://mmk.txt");
		FileInputStream stream = new FileInputStream(file);
		int x = 10/0;
		System.out.println("Hi");
	}
	
	void m2(){
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println(1);
		} catch(IOException ie) {
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}
	}
	
	public static void main(String[] args) {
		new Example6().m2();
	}
}
