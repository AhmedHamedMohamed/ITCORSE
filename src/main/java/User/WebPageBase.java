package User;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

public class WebPageBase {

    public WebDriver driver;
    public JavascriptExecutor jse ;
    Logger logger = Logger.getLogger(WebPageBase.class);
    static int timeinSec=30;

    // create constructor
    public WebPageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver =driver;
    }
}
