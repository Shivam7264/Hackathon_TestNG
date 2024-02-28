package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static XSSFWorkbook workbook = new XSSFWorkbook();
	public static XSSFSheet sheet = workbook.createSheet("MenuList");
	public static XSSFRow headerRow2 = sheet.createRow(0);
	public static void writeData(List<String> list) {
		String filePath = System.getProperty("user.dir") + "\\reports\\testdata.xlsx";
		try {
			headerRow2 = sheet.getRow(0);
			headerRow2.createCell(0).setCellValue("menu1");
			for (int i = 0; i < list.size(); i++) {
				XSSFRow row = sheet.getRow(i + 1);
				if (row == null) {
					row = sheet.createRow(i + 1);
				}
				row.createCell(0).setCellValue(list.get(i));
			}
			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
				workbook.write(fileOut);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
