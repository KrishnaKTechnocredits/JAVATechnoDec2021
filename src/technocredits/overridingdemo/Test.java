package technocredits.overridingdemo;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		SuperClass sc = new SubClass();
		try {
			sc.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
