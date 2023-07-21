package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practice {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\testdata\\StudentInfo.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		 XSSFWorkbook w=new XSSFWorkbook(file); // file open
		 XSSFSheet sheet=w.getSheet("Sheet4");
		 
		 int row=sheet.getLastRowNum();
		 System.out.println("number of rows"+row);
		 int column=sheet.getRow(0).getLastCellNum();
		 System.out.println("number of columns"+column);
		 
		 for(int i=0; i<=row;i++) {
			 XSSFRow r=sheet.getRow(i);
			 for(int j=0;j<column;j++) {
				 XSSFCell c=r.getCell(j);
				 
				 switch(c.getCellType()) {
				 case STRING:System.out.println(c.getStringCellValue());
				 break;
				 case NUMERIC: System.out.println(c.getNumericCellValue());
				 break;
					 
				 }
			 }
		 }
		 
		

	}

}
