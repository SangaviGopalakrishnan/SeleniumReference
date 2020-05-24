package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public String[][] getReadFromExcel(String excelName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./excelFolder/"+excelName+".xlsx");
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		
		String[][] arr = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum ; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				 XSSFCell cell = sheetAt.getRow(i).getCell(j);
				 arr[i-1][j]= cell.getStringCellValue();
			}
			
		}
		return arr;
		
		
	}
}
