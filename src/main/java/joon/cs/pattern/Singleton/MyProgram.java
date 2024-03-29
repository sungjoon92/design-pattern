package joon.cs.pattern.Singleton;

import org.springframework.stereotype.Controller;

@Controller
public class MyProgram {
	public static void main(String[] args) {
		new FirstPage().setAndPrintSettings();
		new SecondPage().printSettings();
	}
}