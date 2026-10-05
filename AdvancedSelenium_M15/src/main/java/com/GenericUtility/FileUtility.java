package com.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this class is used to fetch test data from external resource file
 * @author Tribhuwan
 */
public class FileUtility {
	/**
	 * this method is used to fetch test data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */

		public String readDataFromPropertiesFile(String key) throws IOException{
			
			
		//create object for FileInputStream class form java
			//fetching the file
			
			FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
			
			//create object for file type class (Properties)
			//open the file
			
			Properties prop= new Properties();
			
			//load the data into test script
			
			prop.load(fis);
			
			//read data from the loaded file
			
			String value=prop.getProperty(key);
			
			return value;
		}

	public String generateRandomData() {
		// TODO Auto-generated method stub
		return null;
	}

}

			