package regression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class AddSim extends CommonMethods{
	public WebDriver odriver;
	public AddSim(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void addsim() throws IOException{
		click_element(odriver, By.xpath(getlocvalue("addsimlink")), 15);
	}
}
