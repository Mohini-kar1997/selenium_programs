package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata5 {

	public static void main(String[] args) throws IOException {
		String path=".\\testdata\\StudentInfo.xlsx";
		FileInputStream file1=new FileInputStream(path);
		
		XSSFWorkbook w=new XSSFWorkbook(file1);
		
	//	XSSFSheet sheet=w.getSheetAt(3);
		XSSFSheet sheet=w.getSheet("sheet4");	
		int rows=sheet.getLastRowNum();
		System.out.println(rows);//18
		
		int colum=sheet.getRow(0).getLastCellNum(); // any row number
		System.out.println(colum);
		
		for(int i=0;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j=0; j<colum;j++) {
				XSSFCell cell=row.getCell(j);
				
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				
					
				}
				System.out.println("||");
			}
			
			
		}

	}

}
