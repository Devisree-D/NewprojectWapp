package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wapppg {

	WebDriver driver;
	By rec=By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
	By tec=By.xpath("//*[@id=\"list-item-50\"]/div/div[1]");
	By shp=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span");
	By crtald=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a");
	By slttech=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span");
	
	
	public Wapppg(WebDriver driver) {
		this.driver=driver;
	}


	public void searchTech() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.findElement(rec).click();
		System.out.println("rec");
		driver.findElement(tec).click();
		System.out.println("tec");
		driver.findElement(shp).click();
		System.out.println("shp");
		driver.findElement(crtald).click();
		System.out.println("crtald");
		driver.findElement(slttech).click();
		System.out.println("slttech");
	
	}
}
