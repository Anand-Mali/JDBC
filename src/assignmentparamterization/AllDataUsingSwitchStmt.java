package assignmentparamterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllDataUsingSwitchStmt {

	public static void main(String[] args) throws IOException {
	String path="C:\\Users\\rushi\\Desktop\\Employee.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook work=new XSSFWorkbook(file);
    XSSFSheet	sheet =work.getSheet("Sheet1");
    int Row=sheet.getLastRowNum();
    System.out.println(Row);
    int cell=sheet.getRow(1).getLastCellNum();
    System.out.println(cell);
    for(int R=0;R<=Row;R++)
    {
    	XSSFRow row1=sheet.getRow(R);
    	for(int C=0;C<cell;C++)
    	{
    		XSSFCell cell1=row1.getCell(C);
    		switch(cell1.getCellType())
    		{
    		case NUMERIC:System.out.print(cell1.getNumericCellValue());break;
    		case STRING:System.out.print(cell1.getStringCellValue());break;
    		
    		default:
    			System.out.println("");
    		}
    		System.out.print(" | ");
    	}
    	System.out.println();
    	work.close();
    }
    

	}

}
