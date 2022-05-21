
package Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jopendocument.dom.spreadsheet.MutableCell;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class ReadExcel {

	public Map loadExcelData() throws IOException {

		File file = new File("C:\\Users\\mindsdet355\\Downloads\\cucumber\\excel_data.ods");
		Map<String,String> excellDataMap = new HashMap<String,String>();
		SpreadSheet spreadsheet;
		try {
			spreadsheet = SpreadSheet.createFromFile(file);
			int nRowCount = spreadsheet.getSheet(0).getRowCount();
			MutableCell cell = null;
			for (int i = 1; i < nRowCount; i++) {
				excellDataMap.put(spreadsheet.getSheet(0).getCellAt(0, i).getValue().toString(), spreadsheet.getSheet(0).getCellAt(1, i).getValue().toString());
			}
		//	System.out.println(excellDataMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return excellDataMap;
	}
	
	public static HashMap<String, String> readDataTableAsMaps(DataTable inputTestData){
		List<Map<String, String>> inputDataTable = inputTestData.transpose().asMaps(String.class, String.class);
		HashMap<String, String> inputData = new HashMap<String, String>();
		for(Map<String, String> map : inputDataTable) {
			inputData.putAll(map);
		}
		return inputData;
	}
}