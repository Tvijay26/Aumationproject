package flipkart.utitity;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

    public static void main(String[] args) throws Exception {

        FileInputStream excel = new FileInputStream("C:\\Users\\T VIJAY KARTHIK\\OneDrive\\Desktop\\JAVA 2025\\FLIPKART\\Testdata\\Excelreader.xlsx");

        XSSFWorkbook book = new XSSFWorkbook(excel);
        XSSFSheet sheet = book.getSheet("sheet1");

        int rows = sheet.getLastRowNum();

        for (int i = 0; i <= rows; i++) {

            XSSFRow row = sheet.getRow(i);
            if (row == null) continue;

            int cells = row.getLastCellNum();

            for (int j = 0; j < cells; j++) {

                XSSFCell cell = row.getCell(j);
                if (cell == null) continue;

                System.out.print(cell.getStringCellValue() + " | ");
            }

            System.out.println();
        }

       
    }
}
