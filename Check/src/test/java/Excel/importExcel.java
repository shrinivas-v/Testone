package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class importExcel {
	
	static XSSFWorkbook workbook;
	
	public static void main(String args[]) {
		
		getRowCount();
		getCellData(1,2,3,4);
		
	}
	
	public static void getRowCount() {
		
		
		try {
			workbook = new XSSFWorkbook("D:\\BCP laptop\\Eclipse Workspace\\Check\\Excel\\Data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : " +rowCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}
	
	public static void getCellData(int r1, int c1,int r2,int c2) {
		
		try {
			workbook = new XSSFWorkbook("D:\\BCP laptop\\Eclipse Workspace\\Check\\Excel\\Data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			String data = sheet.getRow(r1).getCell(c1).getStringCellValue();
			System.out.println("Data in cell 1,0 is " +data);
			Double number = sheet.getRow(r2).getCell(c2).getNumericCellValue();
			System.out.println("Data in cell 1,1 is " +number);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
