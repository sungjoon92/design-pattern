package joon.cs.pattern.Singleton;

import org.springframework.stereotype.Controller;

@Controller
public class SecondPage {
	private Settings settings = Settings.getSettings();

	public void printSettings() {
		System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}