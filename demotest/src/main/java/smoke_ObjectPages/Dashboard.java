package smoke_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.CommonMethods;

public class Dashboard extends CommonMethods {

	WebDriver odriver;
	public Dashboard(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void gotodashboard() throws IOException{
		click_element(odriver, By.xpath(getlocvalue("Dashboard")), 15);
		System.out.println("This is dashboard");
	}
}
