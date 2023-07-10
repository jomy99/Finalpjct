package Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Register;

public class BaseClass {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://glitzindia.in");
}
@Test
public void testing() throws InterruptedException
{
	Register ob=new Register(driver);
	
	
	
	driver.manage().window().maximize();
	ob.setvalues("Joicy","9090987654","jimoy.thomas@gmail.com");
	ob.clicksignup();
	ob.newarrivals();
	ob.billing();
	ob.placeorder();
	//ob.buynow();
	
}
}
