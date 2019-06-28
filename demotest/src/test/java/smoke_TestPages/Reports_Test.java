package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.Reports;

public class Reports_Test extends BaseClass {

	public Reports repo;
	@Test
	public void repotest() throws IOException{
		repo=new Reports(odriver);
		repo.clickreport();
	}
}
