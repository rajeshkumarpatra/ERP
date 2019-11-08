package generics;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
    public static String getData(String file_name,String sheet_name,int rn,int cn)
    {
    	try 
    	{
			FileInputStream fis = new FileInputStream(new File(file_name));
			String data = WorkbookFactory.create(fis).getSheet(sheet_name).getRow(rn).getCell(cn).toString();
			return data;
		} 
    	catch (Exception e) 
    	{
			return "";
		}
    }
    public static int getRowCount(String file_name,String sheet_name)
    {
    	try 
    	{
			FileInputStream fis = new FileInputStream(new File(file_name));
			int rc = WorkbookFactory.create(fis).getSheet(sheet_name).getLastRowNum();
			return rc;
		} 
    	catch (Exception e) 
    	{
			return 0;
		}
    	
    }
    public static short getCellCount(String file_name,String sheet_name,int rn)
    {
    	try 
    	{
			FileInputStream fis = new FileInputStream(new File(file_name));
			short cc = WorkbookFactory.create(fis).getSheet(sheet_name).getRow(rn).getLastCellNum();
			return cc;
		} 
    	catch (Exception e) 
    	{
			return 0;
		}
    }
}
