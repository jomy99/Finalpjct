package Pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class Register {
WebDriver driver;
By name=By.xpath("/html/body/main/section[1]/div/div/div/form/div/div[2]/div[1]/div/input");
By Phno=By.xpath("/html/body/main/section[1]/div/div/div/form/div/div[3]/div/div/input");
By email=By.xpath("/html/body/main/section[1]/div/div/div/form/div/div[2]/div[2]/div/input");
By viewdetail=By.xpath("//*[@id=\"latest-product-listing\"]/div[2]/div/div[1]/a[1]/img");
By buynw=By.id("btn-cart-add-quick-buy");
By emailid=By.xpath("//*[@id=\"address_rows\"]/div/div[1]/div/input");
By fulname=By.xpath("//*[@id=\"address_rows\"]/div/div[2]/div/input");
By housename=By.xpath("//*[@id=\"address_rows\"]/div/div[3]/div/input");
By street=By.xpath("//*[@id=\"address_rows\"]/div/div[4]/div/input");
By place=By.xpath("//*[@id=\"address_rows\"]/div/div[5]/div/input");
By Postoffice=By.xpath("//*[@id=\"address_rows\"]/div/div[6]/div/input");
By pin=By.xpath("//*[@id=\"address_rows\"]/div/div[7]/div/input");
By city=By.xpath("//*[@id=\"address_rows\"]/div/div[8]/div/input");
By District=By.xpath("//*[@id=\"address_rows\"]/div/div[9]/div/input");
By state=By.xpath("//*[@id=\"ID_shipping_state\"]");
By mobno=By.xpath("//*[@id=\"address_rows\"]/div/div[12]/div/div/input");
By placeorder=By.xpath("//*[@id=\"form_fast_checkout\"]/div/div[3]/div/div[3]/input");
By size=By.xpath("//*[@id=\\\"general\\\"]/div/div[2]/div/div[4]/div/div[1]/label");
By stret=By.xpath("//*[@id=\"address_rows\"]/div/div[4]/div/input");
public Register(ChromeDriver driver) {
	this.driver=driver;
}
public void placeorder()
{
	driver.findElement(placeorder).click();
}
public void setvalues(String fname,String cno,String mail) 
{
	driver.get("https://glitzindia.in/user-register");
	driver.findElement(email).sendKeys(mail);
	driver.findElement(Phno).sendKeys(cno);
	driver.findElement(name).sendKeys(fname);
}

public void clicksignup()
{
	driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/form/div/div[5]/button")).click();
}
public void buynow()
{
	driver.findElement(By.xpath("//*[@id=\"general\"]/div/div[2]/div/div[4]/div/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"btn-cart-add-quick-buy\"]")).click();
	
}
public void billing()
{ 
	driver.findElement(emailid).sendKeys("jomytheresa94@gmail.com");
	driver.findElement(District).sendKeys("Kottayam");
	driver.findElement(mobno).sendKeys("9898765456");
	driver.findElement(city).sendKeys("Karukachal");
	driver.findElement(pin).sendKeys("989876");
	driver.findElement(state).sendKeys("Kerala");
	driver.findElement(place).sendKeys("Koothrapally");
	driver.findElement(housename).sendKeys("Neliyaniyil");
	driver.findElement(fulname).sendKeys("JOMY THERESA");
	driver.findElement(Postoffice).sendKeys("Koothrapally");
	driver.findElement(stret).sendKeys("Karukachal");
}
public void newarrivals()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"latest-product-listing\"]/div[44]/div/div[1]/a[1]/img")).click();
	WebElement radio = driver.findElement(By.id("38"));
	radio.click();
	driver.findElement(buynw).click();
	
}
}
