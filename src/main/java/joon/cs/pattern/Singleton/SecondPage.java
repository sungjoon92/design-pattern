package joon.cs.pattern.Singleton;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondPage {
	private Settings settings = Settings.getSettings();
	
//	private Settings settings = new Settings();
	public SecondPage() {
		System.out.println("SecondPage_객체생성");
	}
	
	@RequestMapping("/Second.do")
	public ModelAndView printSettings() {
		ModelAndView mav = new ModelAndView();
		System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
		mav.setViewName("/SecondPage");
		return mav;
	}
}