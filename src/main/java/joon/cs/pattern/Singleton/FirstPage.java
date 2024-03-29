package joon.cs.pattern.Singleton;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstPage {
	private Settings settings = Settings.getSettings();

	
	public FirstPage() {
		System.out.println("FirstPage_객체생성");
	}
//	http://localhost:9096/main
	@RequestMapping("/main")
	public ModelAndView setAndPrintSettings() {
		ModelAndView mav = new ModelAndView();
		settings.setDarkMode(true);
		settings.setFontSize(15);
		System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
		mav.setViewName("Singleton");
		return mav;
	}
}