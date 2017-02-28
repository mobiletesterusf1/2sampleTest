import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8081/sample");
		
		System.out.println( driver.getTitle());

	}

}
