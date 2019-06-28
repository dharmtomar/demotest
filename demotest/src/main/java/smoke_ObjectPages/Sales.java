package smoke_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class Sales extends CommonMethods{

	public WebDriver odriver;
	public Sales(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void clicksales() throws IOException{
		click_element(odriver, By.xpath(getlocvalue("Sales")), 15);
		System.out.println("This is Sales section");
		//takescreenshot();
	}
}
