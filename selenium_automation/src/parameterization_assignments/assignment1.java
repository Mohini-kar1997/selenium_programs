package parameterization_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class assignment1 {

	public static void main(String[] args) throws IOException {
		
		//using switch
		String path=".\\testdata\\Employee.xlsx";   //path where file is stored
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook w=new XSSFWorkbook(file);   //opens particular file
		                                         //XSSFWorkbook-class-represents overall wrokbook structure in excel
		
		XSSFSheet sheet=w.getSheet("Sheet1");   //opens particular sheet
        
		int Last_row_number=sheet.getLastRowNum();
		System.out.println("Last row number in file--->"+Last_row_number);
		
		int Last_column_Number=sheet.getRow(0).getLastCellNum();
		System.out.println("Last column number in file--->"+Last_column_Number);
		
		for(int i=0; i<=Last_row_number; i++) {  // 0 to 4
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<Last_column_Number;j++) {  //till 5
				XSSFCell cell=row.getCell(j);
				
				String cellvalue="";
				
				switch(cell.getCellType()) {
				case STRING:                              //constantas of cellType class
					cellvalue=cell.getStringCellValue();
				    break;
				case NUMERIC:
					cellvalue=String.valueOf(cell.getNumericCellValue());
				    break;
				case BOOLEAN:
					cellvalue=String.valueOf(cell.getBooleanCellValue());
			    	break;
			
				}
				System.out.print(cellvalue+"\t");
				
			}
			System.out.println();
			
		}
		
	}
	

}
