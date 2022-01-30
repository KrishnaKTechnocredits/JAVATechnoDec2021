package technocredits.exceptiondemo.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3{
	
	
	void m1() throws FileNotFoundException {
		File file = new File("D://mmk.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}
	
	/*
	 * void m2() throws FileNotFoundException{ m1(); }
	 * 
	 * 
	 * void m3() { try { m2(); } catch (FileNotFoundException e) { File file = new
	 * File("D://temp.txt"); try { FileInputStream inputStream = new
	 * FileInputStream(file); } catch (FileNotFoundException e1) {
	 * System.out.println("Something went wrong"); } } System.out.println("End"); }
	 */

	public static void main(String[] args) throws FileNotFoundException{
		Example3 example3 = new Example3();
		example3.m1();
		System.out.println("end");
	}
}
