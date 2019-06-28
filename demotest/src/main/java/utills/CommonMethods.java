package utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

//import com.ibm.icu.text.SimpleDateFormat;

public class CommonMethods {

	static Properties locators;
	static Properties testdata;
	static File configfile;
	static FileInputStream filestream;
	public static WebDriver odriver;
	
	public void Initialization() throws IOException{
		SelectBrowser(getdatavalue("Browser"));
		odriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		odriver.manage().window().maximize();
		odriver.get(getdatavalue("BaseURL"));
		loginEZBOT();
	}
	public void SelectBrowser(String browsername){
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			odriver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Drivers\\firefoxdriver.exe");	
		odriver=new FirefoxDriver();
		}
	}
	public static void loadproperties(String datatype) throws IOException {
		if(datatype.equalsIgnoreCase("loc")) {
			locators=new Properties();
			configfile=new File(System.getProperty("user.dir"),"src\\main\\java\\config\\locators.properties");
			filestream=new FileInputStream(configfile);
			locators.load(filestream);
			
		}
		else if(datatype.equalsIgnoreCase("data")) {
			testdata=new Properties();
			configfile=new File(System.getProperty("user.dir"),"src\\main\\java\\config\\testdata.properties");
			filestream=new FileInputStream(configfile);
			testdata.load(filestream);
		}
	}
		public static String getlocvalue(String key)throws IOException {
			loadproperties("loc");
			String lval=locators.getProperty(key);
			return lval; 
	}
		public static String getdatavalue(String key) throws IOException {
			loadproperties("data");
			String dval=testdata.getProperty(key);
			return dval;
			
		}
		public static void click_element(WebDriver odriver,By oby,int wait) {
			explicit_wait(odriver, oby, wait);
			odriver.findElement(oby).click();
			
		}
		public static void enter_Text(WebDriver odriver,By oby,String txt,int wait) {
			explicit_wait(odriver, oby, wait);
			odriver.findElement(oby).sendKeys(txt);
			
		}
		public static void explicit_wait(WebDriver odriver,By oby,int wait) {
			WebDriverWait Wait=new WebDriverWait(odriver, wait);
			Wait.until(ExpectedConditions.presenceOfElementLocated(oby));
		}
		public static void loginEZBOT() throws IOException{
			enter_Text(odriver, By.xpath(getlocvalue("loginid")), getdatavalue("LoginID"), 15);
			enter_Text(odriver, By.xpath(getlocvalue("password")), getdatavalue("Password"), 15);
			click_element(odriver, By.xpath(getlocvalue("Submit")), 15);
		}
		public void takescreenshot() throws IOException {
		File dfile=new File("Screenshots\\"+"ds.png");
		File sfile=((TakesScreenshot)odriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sfile,dfile);
		System.out.println("Screenshot taken successfully");
	}
		/*public static String timestamp() throws IOException {
			return new SimpleDateFormat("ddmmyy").format(new Date());
		}*/
		public void logout()throws IOException{
			//click_element(odriver, By.xpath(getlocvalue("EZBOT_Logout")), 15);
			//click_element(odriver, By.xpath(getlocvalue("Logout")), 15);
			List<WebElement> allLinks = odriver.findElements(By.xpath(getlocvalue("EZBOT_Logout")));
			Iterator<WebElement> itr = allLinks.iterator();
			while(itr.hasNext()) {
			    System.out.println(itr.next().getText());
			}
		}
}
