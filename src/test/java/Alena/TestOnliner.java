package Alena;
		import org.openqa.selenium.NoSuchElementException;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.By;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.testng.Assert;
		import org.testng.annotations.Test;
		import java.util.ArrayList;
		import java.util.List;
public class TestOnliner {
				
		    @Test
		    public void test() throws InterruptedException {
		        WebDriver driver = new FirefoxDriver();

		        // And now use this to visit Google
		        driver.get("http://www.onliner.by");

		        // Find the text input element by its name
		        WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/header/div/div[2]/div[2]/div[2]/div[1]"));

		        // Enter something to search for
		        //element.sendKeys("Selenium");

		        // Now submit the form. WebDriver will find the form for us from the element
		        element.click();

		        //
		        WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div[2]/form/div[1]/div[1]/input")));
		        String email="lena_rynyak@mail.ru";
		        login.sendKeys(email);
		  
		        WebElement password = driver.findElement(By.xpath("//div/div[2]/form/div[1]/div[2]/input"));
		        password.sendKeys("qwerty");
		        //
		        WebElement enterButton=driver.findElement(By.xpath("//div/div[2]/form/div[4]/div/button"));
		        enterButton.submit();
		        
		        WebElement loginError = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/div/div[2]/form/div[4]/div[1]")));
		        Assert.assertTrue(loginError.isDisplayed(), "Неверный пароль");
		        
		        
		       /* Assert.assertTrue(myDynamicElement.isDisplayed(), "Results page is not displayed");
		        //Here we get the search result list
		        List<WebElement> searchResultList= driver.findElements(By.xpath("//h3[@class='r']/a"));
		        //Check if 3 first links have 'Selenium' word
		        for (int i=0;i<4; i++)
		        {
		            System.out.println(searchResultList.get(i).getText());
		            Assert.assertTrue(searchResultList.get(i).getText().contains("Selenium"));

		        }

		        // Check the title of the page
		        System.out.println("Page title is: " + driver.getTitle());*/

		        driver.quit();

		    }
		

	}


