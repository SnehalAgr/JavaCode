package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fip=new FileInputStream(".\\src\\Global.properties");
        Properties prop=new Properties();
        prop.load(fip);
        
        System.out.println(prop.getProperty("Browsertype"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("TestEnvi"));

	}

}
