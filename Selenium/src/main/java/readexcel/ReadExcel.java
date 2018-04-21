package readexcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//finding the path of the folder
		XSSFWorkbook workbook=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//going to the first sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//getting rows count
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count :" +rowcount);
		
		int columnscount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total coulmns count :"+columnscount);
		
		for (int i = 1; i <= rowcount; i++) {
			//finding the coulmns with specific row
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnscount; j++) {
				//getting the cell value
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} 
		}
	workbook.close();	
		

			
		
		
	}

}
