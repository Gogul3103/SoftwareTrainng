package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void LaunchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void LaunchUrl(String url) {
		driver.get(url);
	}

	public static void WindowsMaximize() {
		driver.manage().window().maximize();
	}

	public static void passtext(String text, WebElement ele) {
		ele.sendKeys(text);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public static void clickbtn(WebElement ele) {
        ele.click();
	}
	public static void closebrowser() {
       driver.quit();
	}

	public static void excelread(String sheetname, int rowNum, int cellNum) throws IOException {
		File f = new File("Excel file location.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fs);
		XSSFSheet mysheet = w.getSheet(sheetname);
		XSSFRow row = mysheet.getRow(rowNum);
		XSSFCell cell = row.getCell(cellNum);
		int celltype = cell.getCellType();

		if (celltype == 1) {
			String stringCellValue = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-mmm-yyyy");
			String format = s.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);

		}

	}

	public static void CreatExcelSheet(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\syuva\\eclipse-workspace\\MavenTest1\\Data4//newfile.xlsx");
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet newsheet = w.createSheet("mydata");
		XSSFRow row = newsheet.createRow(creRow);
		XSSFCell cell = row.createCell(creCell);
		cell.setCellValue(newData);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}

	public static void CreateRow(int creRow, int crecell, String newData) throws IOException {
		File f = new File("C:\\\\Users\\\\syuva\\\\eclipse-workspace\\\\MavenTest1\\\\Data4//newfile.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fs);
		XSSFSheet mysheet = w.getSheet("mydata");
		XSSFRow row = mysheet.createRow(creRow);
		XSSFCell cell = row.createCell(crecell);
		cell.setCellValue(newData);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}

	public static void createCell(int rownum, int crecell, String newdata) throws IOException {
		File f = new File("C:\\Users\\syuva\\eclipse-workspace\\MavenTest1\\Data4//newfile.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fs);
		XSSFSheet sheet = w.getSheet("mydata");
		XSSFRow row = sheet.getRow(rownum);
		XSSFCell cell = row.createCell(crecell);
		cell.setCellValue(newdata);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);

	}
	
   
	}


