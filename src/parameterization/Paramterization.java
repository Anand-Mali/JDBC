package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\rushi\\Desktop\\Book1.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		double data=WorkbookFactory.create(file).getSheet("firstexcelprogram").
				getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);

	}

}
