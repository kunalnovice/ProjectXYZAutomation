package com.Automation.ProjectABC.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadsheetReader extends Utility {

    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;

    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

    public static void setExcelFile(String Path,String SheetName) throws Exception {

        try {

            // Open the Excel file

            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

        } catch (Exception e){

            throw (e);

        }

    }

    //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{

        try{

            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            String CellData = Cell.getStringCellValue();

            return CellData;

        }catch (Exception e){

            return"";

        }

    }

    //This method is to write in the Excel cell, Row num and Col num are the parameters

    public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

        try{

            Row  = ExcelWSheet.getRow(RowNum);

            Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

            if (Cell == null) {

                Cell = Row.createCell(ColNum);

                Cell.setCellValue(Result);

            } else {

                Cell.setCellValue(Result);

            }

            // Constant variables Test Data path and Test Data file name

            FileOutputStream fileOut = new FileOutputStream(testConfigs.readProperty("USER_DATA_FILE_PATH") + testConfigs.readProperty("USER_DATA_SHEET_NAME"));

            ExcelWBook.write(fileOut);

            fileOut.flush();

            fileOut.close();

        }catch(Exception e){

            throw (e);

        }

    }

    private XSSFSheet getSheet(String path, String fileName, String SheetTabName) {
        File srcFile = new File (path+"/"+fileName);
        FileInputStream fis;
        XSSFWorkbook wb;
        XSSFSheet sh = null;
        try{
            fis = new FileInputStream(srcFile);
            wb = new XSSFWorkbook(fis);
            sh = wb.getSheet(SheetTabName);

        } catch (Exception e) {
            log.log_library_error("Unable to Load file", e);
        }
         //sh.getC
        return sh;
    }

    private boolean isStringExistinginTab(XSSFSheet sh, String str) {
        boolean bool = false;
        //for(int i = 0; j=0; i<)
        return bool;
    }



}