package Test;

import org.junit.Test;

import Pages.StartBrowser;

public class Test_webdriver {
   
	@Test
	public void test(){
		
		StartBrowser startB = new StartBrowser();
		startB.startBrowser();
	}
}
