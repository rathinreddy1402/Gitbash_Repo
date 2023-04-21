package Pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@Test(dataProvider = "dataProviderTest")
		public void bookTickets(String src,String dest)
		{
			System.out.println("Book titckets from "+src+" to "+dest);
		}
@DataProvider
public Object[][] dataProviderTest()
{
	Object[][] objArr =new Object[3][2];
	
	objArr[0][0]="Bangalore";
	objArr[0][1]="Goa";
	
	objArr[1][0]="Bangalore";
	objArr[1][1]="Mumbai";
	
	objArr[2][0]="Bangalore";
	objArr[2][1]="Mysore";
	
	return objArr;
	
}
}
