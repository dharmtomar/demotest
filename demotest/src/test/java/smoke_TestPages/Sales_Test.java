package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.Sales;

public class Sales_Test extends BaseClass{
	Sales sl;
	@Test
	public void salestest() throws IOException{
		sl=new Sales(odriver);
		sl.clicksales();
	}
}
