import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FiredoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://selenium.dev/");
	}
}
