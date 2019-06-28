package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.UserMgt;

public class User_Mgt_Test extends BaseClass{

	public UserMgt usermgt;
	@Test
	public void usermgttest() throws IOException{
		usermgt=new UserMgt(odriver);
		usermgt.usermanagementclick();
	}
}
