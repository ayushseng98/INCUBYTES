package inctesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceldata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src= new File("\"C:\\Users\\ayush\\OneDrive\\Desktop\\Testdata\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook  wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
        String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println(data0);
		System.out.println(data1);
		wb.close();
		
		
	
	}
}
