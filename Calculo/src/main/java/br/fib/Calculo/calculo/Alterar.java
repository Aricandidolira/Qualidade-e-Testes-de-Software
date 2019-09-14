package br.fib.Calculo.calculo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.5.115:9098/calculator/update/3");

		// encontrando ambos elementos na pagina
		WebElement name = driver.findElement(By.name("name"));
		WebElement dependents = driver.findElement(By.name("dependents"));
		WebElement timeToWork = driver.findElement(By.name("timeToWork"));
		WebElement salaryHour = driver.findElement(By.name("salaryHour"));

		// digitando em cada um deles
		name.clear();
		name.sendKeys("Ariadne");
		dependents.clear();
		dependents.sendKeys("3");
		timeToWork.clear();
		timeToWork.sendKeys("30");
		salaryHour.clear();
		salaryHour.sendKeys("100.00");

		WebElement salvar = driver.findElement(By.id("salvar"));
		salvar.click();
	}
}
