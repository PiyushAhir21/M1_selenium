package vtiger_crm_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
//		creating java representation object of that physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\git\\M1_selenium\\M1_Selenium_01\\resource\\commondata.properties");
		
		Properties pObj = new Properties();
//		load all the keys by using load() 
		pObj.load(fis);
		
//		getting data or value by using getProperty()
		String BROWSER = pObj.getProperty("bro");
		System.out.println("Browser is : " + BROWSER);
	}

}
