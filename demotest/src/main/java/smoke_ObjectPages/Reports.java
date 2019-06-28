package smoke_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class Reports extends CommonMethods {

			WebDriver odriver;
			public Reports(WebDriver odriver) {
				this.odriver=odriver;
			}
			public void clickreport() throws IOException{
				click_element(odriver, By.xpath(getlocvalue("Reports")), 15);
				System.out.println("This is report section");
			}
}
