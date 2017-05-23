package com.raven.sheiboi.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteExcelFile {


    public static  String  readXLSXFile(int row, int col) throws IOException {

        Cell cell = null;

        try {

            FileInputStream file = new FileInputStream("LoginTest.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow sheetrow = sheet.getRow(row);
            cell = sheetrow.getCell(col);

            file.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return cell.toString();

    }

    public static void writeXLSXFile(int row,int col, String actualValue) throws IOException {

        Cell cell = null;

        try {

            FileInputStream file = new FileInputStream("LoginTest.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow sheetrow = sheet.getRow(row);

            if(sheetrow == null)
            {
                sheetrow = sheet.createRow(row);
            }

            cell = sheetrow.getCell(col);

            if(cell == null)
            {
                cell = sheetrow.createCell(col);
            }

            cell.setCellValue(actualValue);

            file.close();

            FileOutputStream outFile = new FileOutputStream("LoginTest.xlsx");
            workbook.write(outFile);
            outFile.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}