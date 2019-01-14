package components;

import initializer.InitilizeHook;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hook extends InitilizeHook {
	
	 String testName;
    
    
	public Hook() {
	}
	
	@BeforeTest
	public static void setUpClass() {
		OpenConfiguration();
		OpenLogger();
		OpenDelivery();
		OpenReport("Reporte");
	}
	
	@BeforeMethod
	public void setUp(Method method) throws FileNotFoundException, IOException {
		testName = method.getName();
		OpenBrowser();
		OpenContextData(testName);
		
	}
	
	@AfterMethod
	public void tearDown() {
		CloseContextData(testName);
		
	}
	
	@AfterTest
	public static void tearDownClass() {
		CloseBrowser();
		CloseReport();
		CloseDelivery();
		CloseConfiguration();
		
		
		
	}
	
}
