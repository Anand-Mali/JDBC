package assignmentparamterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LastRowAndLastCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\rushi\\Desktop\\Employee.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook work = new XSSFWorkbook(file);
		double data = work.getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue();
		System.out.println(data);
		
		String str = work.getSheet("Sheet1").getRow(4).getCell(4).getStringCellValue();
		System.out.println(str);
		work.close();
		

	}

}
