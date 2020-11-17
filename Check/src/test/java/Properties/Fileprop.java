package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Fileprop {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
		
		}
	
	public static void getProperties() {
		
		try {
		
			InputStream input = new FileInputStream("D:\\BCP laptop\\Eclipse Workspace\\Check\\src\\test\\java\\Properties\\config.properties");
			prop.load(input);
			String b = prop.getProperty("browser");
			System.out.println(b);
			
			TestNG.browser = b;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
	
	public static void setProperties() {
		
		try {
			OutputStream output = new FileOutputStream("D:\\BCP laptop\\Eclipse Workspace\\Check\\src\\test\\java\\Properties\\config.properties");
			prop.setProperty("result","PASS");
			prop.store(output, null);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	
	}

}
