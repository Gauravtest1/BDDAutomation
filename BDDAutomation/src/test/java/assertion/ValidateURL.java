package assertion;

import org.openqa.selenium.WebDriver;

public class ValidateURL {
	public Boolean URL(WebDriver driver, String expct)
	
	{
		Boolean flag=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expct))
		{
			flag=true;
		}
		return flag;
	}
}
