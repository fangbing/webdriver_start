package Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize_browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		Thread.sleep(2000);
		
		//Dimension screenResolution = new Dimension(320,480);
	    //dr.manage().window().setSize(screenResolution);
	    
		System.out.println("will be resize");
	    dr.manage().window().setSize(new Dimension(320,480));
	    
	    
		

	}

}
