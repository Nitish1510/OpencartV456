package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//DataProvider1
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		String path =".\\testData\\logindatas.xlsx";  //D:\Project1\testData\logindatas.xlsx
		ExcelUtility xlutil = new ExcelUtility(path);
				
		int totalrows =xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String logindata [][] = new String [totalrows][totalcols];  //created for two dimension array which can store Excel value
		//read the data from excel and storing in two dimensional array, here i is row & j is col
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j); //returning 2-dimensional array
			}
		}
 		
		return logindata;
		
	}

}
