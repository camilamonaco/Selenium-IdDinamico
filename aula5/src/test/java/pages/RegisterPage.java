package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	static WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherIdDinamico() {
		
		
		WebElement firstName = driver.findElement(By.xpath(".//label[text() = 'Full Name* ']/following-sibling::div[1]/input"));
		firstName.sendKeys("Camila");
		
		WebElement lastName = driver.findElement(By.xpath(".//label[text() = 'Full Name* ']/following-sibling::div[2]/input"));
		lastName.sendKeys("Monaco");
		
		WebElement address = driver.findElement(By.xpath(".//label[text() = 'Address']/following-sibling::div/textarea"));
		address.sendKeys("Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste ");
		
		WebElement email = driver.findElement(By.xpath(".//label[text() = 'Email address*']/following-sibling::div/input"));
		email.sendKeys("monacocamila1@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath(".//label[text() = 'Gender*']/following-sibling::div/label[1]/input"));
		gender.click();
		
		WebElement hobbyCricket = driver.findElement(By.xpath(".//label[text() = 'Hobbies']/following-sibling::div/div[1]/input"));
		hobbyCricket.click();
		
		WebElement hobbyMovies = driver.findElement(By.xpath(".//label[text() = 'Hobbies']/following-sibling::div/div[2]/input"));
		hobbyMovies.click();
		
		WebElement hobbyHockey = driver.findElement(By.xpath(".//label[text() = 'Hobbies']/following-sibling::div/div[3]/input"));
		hobbyHockey.click();
		
		WebElement language1 = driver.findElement(By.xpath(".//label[text() = 'Languages']/following-sibling::div/multi-select/div[1]"));
		language1.click();
		
		WebElement language2 = driver.findElement(By.xpath(".//label[text() = 'Languages']/following-sibling::div/multi-select/div[2]/ul/li[2]/a"));
		language2.click();
		
		Select skills = new Select(driver.findElement(By.xpath(".//label[text() = 'Skills']/following-sibling::div/select")));
		skills.selectByVisibleText("AutoCAD");
		
		Select selectCountry = new Select(driver.findElement(By.xpath(".//label[text() = 'Select Country :']/following-sibling::div/select")));
		selectCountry.selectByValue("United States of America");
		
		Select yearBirth = new Select(driver.findElement(By.xpath(".//label[text() = 'Date Of Birth']/following-sibling::div[1]/select")));
		yearBirth.selectByValue("1922");
		
		Select monthBirth = new Select(driver.findElement(By.xpath(".//label[text() = 'Date Of Birth']/following-sibling::div[2]/select")));
		monthBirth.selectByValue("April");
		
		Select dayBirth = new Select(driver.findElement(By.xpath(".//label[text() = 'Date Of Birth']/following-sibling::div[3]/select")));
		dayBirth.selectByValue("7");
		
		WebElement password = driver.findElement(By.xpath(".//label[text() = 'Password']/following-sibling::div/input"));
		password.sendKeys("Teste@1234");
		
		WebElement confirmPassword = driver.findElement(By.xpath(".//label[text() = 'Confirm Password']/following-sibling::div/input"));
		confirmPassword.sendKeys("Teste@1234");
		
		Select countries = new Select(driver.findElement(By.id("countries")));
		countries.selectByValue("United States");
		
	}
	
	
}
