package smoke_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class UserMgt  extends CommonMethods{
	WebDriver odriver;
	public UserMgt(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void usermanagementclick() throws IOException {
		click_element(odriver, By.xpath(getlocvalue("Usermgt")), 15);
		System.out.println("This is user mgt");
	}
}
