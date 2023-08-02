package seleniumProject;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\ACCESS\\Documents\\excel import files\\SeleniumExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//getting the number of sheets in the entire window
		int sheets = workbook.getNumberOfSheets();
		for(int i=0; i< sheets; i++) {
			//checking for particular sheet name
			if(workbook.getSheetName(i).equalsIgnoreCase("tessssst1Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
			}
		}

	}

}
