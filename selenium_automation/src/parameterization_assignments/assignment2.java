package parameterization_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class assignment2 {

	public static void main(String[] args) throws IOException  {
		//using if else if
		String path=".\\testdata\\Employee.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet sheet=w.getSheet("Sheet1");
        
		int Last_row_numbers=sheet.getLastRowNum();
		System.out.println("Last row number in file--->"+Last_row_numbers); //4
		
		int Last_column_number=sheet.getRow(0).getLastCellNum();
		System.out.println("Last column number in file--->"+Last_column_number); //5
		
		for(int i=0; i<=Last_row_numbers; i++) {  // 0 1 2 3 4
			XSSFRow r=sheet.getRow(i);
			 
			for(int j=0;j<Last_column_number;j++) { //0 1 2 3 4 
				XSSFCell cell=r.getCell(j);
			
				String cellvalue="";
				//This line of code is often used as a starting point for storing or manipulating data related to a cell in a table or spreadsheet. 
				/*By initializing cellvalue with an empty string, 
				 * it sets the initial value of the variable to be an empty or blank value, 
				 * which can be later updated or modified as needed within the program.
				 */
				CellType celltype=cell.getCellType();   //CellType=class
				
				if(celltype==CellType.STRING) {
					cellvalue=cell.getStringCellValue();
					}
				
				else if (celltype == CellType.NUMERIC) {
                    cellvalue = String.valueOf(cell.getNumericCellValue());
                }
				
				else if (celltype == CellType.BOOLEAN) {
                    cellvalue = String.valueOf(cell.getBooleanCellValue());
                }
				
				System.out.print(cellvalue+"\t");
				
				
			}
			System.out.println();
			
		}

	}

}

/*The CellType class is an enumeration that represents the different types
 *  of cells that can exist in an Excel spreadsheet. It defines the following cell types:

BLANK: Represents a cell without any value or content.
BOOLEAN: Represents a cell containing a boolean value (true or false).
ERROR: Represents a cell containing an error value.
FORMULA: Represents a cell containing a formula that calculates a value.
NUMERIC: Represents a cell containing a numeric value.
STRING: Represents a cell containing a string value.*/
