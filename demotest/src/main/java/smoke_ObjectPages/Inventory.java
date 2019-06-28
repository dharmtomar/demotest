package smoke_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class Inventory extends CommonMethods {

	public WebDriver odriver;
	public Inventory(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void inventoryclick() throws IOException {
		click_element(odriver, By.xpath(getlocvalue("Inventorylink")), 15);
		System.out.println("This is Inventory");
	}
	
	
}
