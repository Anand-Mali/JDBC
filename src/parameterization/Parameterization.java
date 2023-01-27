package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\rushi\\Desktop\\StudentData1.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		String Data=WorkbookFactory.create(file).getSheet("firstexcelprogram").
				getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Data);

	}

}
