package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.Admin;

public class Admin_Test extends BaseClass {

	public Admin adm;
	@Test
	public void admintest()  throws IOException{
		adm=new Admin(odriver);
		adm.adminclick();
	}
}
