package nitika;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Utility 
{

	static WebDriver driver;
	
	public static void setUp(Object WebDriverManager)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	
	
}
