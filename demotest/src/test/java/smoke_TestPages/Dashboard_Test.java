package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.Dashboard;

public class Dashboard_Test extends BaseClass{

	public Dashboard dsb;
	@Test
	public void dashboardtest()throws IOException{
		dsb=new Dashboard(odriver);
		dsb.gotodashboard();
	}
}

