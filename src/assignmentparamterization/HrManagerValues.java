package assignmentparamterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HrManagerValues {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\rushi\\Desktop\\Employee.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		String Data=WorkbookFactory.create(file).getSheet("Sheet1").
				getRow(3).getCell(3).getStringCellValue();
		
		System.out.println(Data);

	}

}
