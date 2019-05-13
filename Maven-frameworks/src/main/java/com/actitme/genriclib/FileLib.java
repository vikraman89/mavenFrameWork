package com.actitme.genriclib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Vikraman
 */

public class FileLib {
	/**
	 * This class contain file related methods, which is used to read the data
	 * from Excel and properties file.
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/acttime.properties");
		Properties poj = new Properties();
		poj.load(fis);
		String value = poj.getProperty(key);
		return value;
	}

	/**
	 * it is used to read the data from Excel-workbook, based on user argument
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;

	}
}
