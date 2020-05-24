package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public String[][] getDataFromExcel(String excelName) throws IOException {
		// TODO Auto-generated method stub
		
		//Enter Workbook
		XSSFWorkbook wbook = new XSSFWorkbook("./src/main/java/excelfolder/"+excelName+".xlsx");
		
		//Enter Sheet
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		//get rowcount
		int lastRowNum = sheetAt.getLastRowNum();
		//only header column count will be static so getting header rowcount
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		
		String [][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			//Enter Row
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				//enter cell
				XSSFCell cell = row.getCell(j);
				//Get cell value
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue; //i-1 since java index strts from 0 and here in excel we have eliminated 0th row
			}
		}
		return data;
	}


}
