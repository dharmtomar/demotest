package smoke_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import smoke_ObjectPages.Inventory;

public class Inventory_Test extends BaseClass {
	
	Inventory inv;
	@Test
	public void invtest() throws IOException{
		inv=new Inventory(odriver);
		inv.inventoryclick();
		
	}
}
