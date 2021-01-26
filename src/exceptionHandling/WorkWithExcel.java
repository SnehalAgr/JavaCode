package exceptionHandling;

import xls.ShineXlsReader;

public class WorkWithExcel {

	public static void main(String[] args) {
		ShineXlsReader xls = new ShineXlsReader("TestData.xlsx");
		
		int rowCount = xls.getRowCount("sheet1");
		int ColCount = xls.getColumnCount("sheet1");
		System.out.println("RowCount= " + rowCount);
		System.out.println("ColCount= " + ColCount);
		
		for(int i=2; i<=rowCount; i++)
		{
			for(int j=0; j<ColCount ; j++)
			{
				String cellData= xls.getCellData("sheet1", i, j);
				System.out.println(cellData);
			}
		}
		//xls.addSheet("sheet4");
		xls.addColumn("sheet4", "name");
		xls.getCellData("sheet1", "name", 2);
		//xls.getCellData("sheet4","name", 2, "Snehal");
		

	}

}
