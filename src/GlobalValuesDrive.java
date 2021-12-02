import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\HIMANSHU MISHRA\\eclipse-workspaceNew\\CoreJava\\src\\data.properties");
		//prop.load(fis);
		FileInputStream fis = new FileInputStream("C:\\Users\\HIMANSHU MISHRA\\eclipse-workspaceNew\\CoreJava\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser")); 
		System.out.println(prop.getProperty("url"));
        System.out.println(prop.setProperty("browser", "edge"));
        System.out.println(prop.getProperty("browser"));
        
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HIMANSHU MISHRA\\eclipse-workspaceNew\\CoreJava\\src\\data.properties");
        prop.store(fos, null);
	
	}    
	
	}
