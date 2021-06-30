package org.pruebasCh.tesitng.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.concurrent.TimeUnit;


public class TestSelenium {
    private WebDriver driver;
    By busquedaLocator = By.xpath("//*[local-name()='li']/a[@aria-label='Search Icon Link']");

@Before
    public void TestP(){

        driver= new ChromeDriver();
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().window().maximize();
    }
@Test
public void TestPrue() {
	
	
	driver.findElement(busquedaLocator).click();
    WebElement searchbox = driver.findElement(By.name("s"));
    searchbox.clear();

    searchbox.sendKeys("pruebas");
    searchbox.submit();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //assertEquals("pruebas - choucair", driver.getTitle());
}
@After
    public void tearDown() throws InterruptedException{
	
    
    Thread.sleep(5000);
    driver.quit();

    }
}
