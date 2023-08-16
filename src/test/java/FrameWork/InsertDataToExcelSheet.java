package FrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {
    public static void main(String[] args) throws Throwable {
        FileInputStream fis = new FileInputStream("C:\\Users\\abhijeet\\Downloads\\Book1.xlsx");
        Workbook book = WorkbookFactory.create(fis);
        Sheet sheet = book.getSheet("Sheet1");

        Row row = sheet.getRow(5);
        if (row == null) {
            row = sheet.createRow(5);
        }

        Cell cell = row.getCell(5);
        if (cell == null) {
            cell = row.createCell(5);
        }

        cell.setCellValue("abhi");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\abhijeet\\Downloads\\Book1.xlsx");
        book.write(fos);
        book.close();
        fis.close();
        fos.close();
    }
}

