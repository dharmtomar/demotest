package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class BaseClass extends CommonMethods{

	@BeforeSuite
	public void setup() throws IOException{
		Initialization();
	}
	@AfterClass
	public void teardown()throws IOException {
		logout();
		System.out.println("logout ezbot");
	}
	@Test
	public void test() {
		System.out.println("Title is :"+odriver.getTitle());
		
	}
}
