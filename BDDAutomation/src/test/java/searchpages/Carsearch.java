package searchpages;

import java.io.IOException;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carsearch {
	WebDriver driver;
	ResourceBundle ele= ResourceBundle.getBundle("Element");
	public Carsearch(WebDriver driver)
	{
		this.driver=driver;
		}
	public void clickonheader() throws IOException
	{
		driver.findElement(By.xpath(ele.getString("Carheader_xpath"))).click();
		}
	public void picklocation(String Pick) throws IOException
	{
		driver.findElement(By.xpath(ele.getString("Pickup_xpath"))).sendKeys(Pick);
		}
	public void droplocation(String drop)throws IOException
	{
		driver.findElement(By.xpath(ele.getString("drop_xpath"))).sendKeys(drop);
		}
	public void openpickcalander()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("opencalforPick"))).click();
		}
	public void Choosepickdate()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("clickpickdate"))).click();
		}
	public void Choosepicktime()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("selecttimepick"))).click();
		}
	public void opendropcalander()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("opencalfordrop"))).click();
		}
	public void Choosedropdate()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("clickdropdate"))).click();
		}
	public void Choosedroptime()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("selecttimedrop"))).click();
		}
	public void clickonsubmit()throws IOException
	{
		driver.findElement(By.xpath(ele.getString("clicksubmit"))).click();
	}	
	}
