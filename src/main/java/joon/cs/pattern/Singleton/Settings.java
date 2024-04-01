package joon.cs.pattern.Singleton;

import org.springframework.stereotype.Controller;

@Controller
public class Settings {

	
//	private으로 Settings 를 만들어 다른곳에서 new 생성을 불가능하게만든다.
 
	private Settings () {};
  private static Settings settings = null;

  public static Settings getSettings () {
    if (settings == null) {
      settings = new Settings();
    }
    return settings;
  }

  
//  static이 아닌 변수나 메소드는 객체가 생성될때마다 메모리공간을 자치하지만					 -동적요소
//  static으로 선언된 것들은 객체가 얼마나 만들어지든 메모리에 지정된 공간에 딱하나씩만 존재하게됨 -정적요소
  
  private boolean darkMode = false;
  private int fontSize = 3;

  public boolean getDarkMode () { return darkMode; }
  public int getFontSize () { return fontSize; }

  public void setDarkMode (boolean _darkMode) { 
    darkMode = _darkMode; }
  public void setFontSize (int _fontSize) { 
		fontSize = _fontSize;
	}
}