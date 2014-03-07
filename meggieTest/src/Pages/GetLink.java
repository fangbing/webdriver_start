package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		Thread.sleep(2000);
		
		String url ="http://baidu.com";
		System.out.printf("now access %s \n",url);
		dr.get(url);
		//or use this method
		//dr.navigate().to(url);
		Thread.sleep(2000);
		
		System.out.println("browser will be close");
		dr.quit();

	}

}
