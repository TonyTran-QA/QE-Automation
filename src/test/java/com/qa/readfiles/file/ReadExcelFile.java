package com.qa.readfiles.file;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadExcelFile {

    public void readExcel() throws BiffException, IOException {
        String FilePath = "src/test/java/com/qa/readfiles/file/Book1.xlsx";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        // TO get the access to the sheet
        Sheet sh = wb.getSheet("Sheet1");
        // To get the number of rows present in sheet
        int totalNoOfRows = sh.getRows();
        // To get the number of columns present in sheet
        int totalNoOfCols = sh.getColumns();
        for (int row = 0; row < totalNoOfRows; row++) {

            for (int col = 0; col < totalNoOfCols; col++) {
                System.out.print(sh.getCell(col, row).getContents() + "\t");
            }
            System.out.println();
        }
    }

}