package bass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ulity {
	
	public	static  WebDriver driver ;

	 public static void browers() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myproject.ai/project-owner/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


}
	 public static void main(String[] args) {
		
		Ulity.browers();
	}
	 
	 

}
