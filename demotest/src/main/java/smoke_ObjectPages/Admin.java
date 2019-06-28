package smoke_ObjectPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.CommonMethods;

public class Admin extends CommonMethods {

	public WebDriver odriver;
	public Admin(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void adminclick() throws IOException {
		click_element(odriver, By.xpath(getlocvalue("Adminlink")), 15);
		System.out.println("This is Admin part");
	}
	
}
