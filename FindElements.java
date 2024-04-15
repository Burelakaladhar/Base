package SeTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import SetUpBase.Base;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class FindElements extends Base{
	


@Test(priority=1)
  public void VerifyTotalLinks() {
	//Total no of elements
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  int totalLinks = links.size();
	  System.out.println("Total no of links on page:"+totalLinks);  
  }
  
  
  @Test(priority=2)
  public void verifyFooterLinks() {
	  WebElement footerSection =  driver.findElement(By.id("glbfooter"));
	  int footerLinksCount = footerSection.findElements(By.tagName("a")).size();
	  System.out.println("Total no of Footeer Links Count:"+footerLinksCount);	  
  }
  @Test(priority=3)
  public void verifyFootSectionSecondColumnLinks() {
	  WebElement secColumn = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
	  List<WebElement> SecColumnList = secColumn.findElements(By.tagName(("a")));
	  int secColumnLinksCount = SecColumnList.size();
	  System.out.println(" Footer Section Second Column total Links:"+secColumnLinksCount);
  
  
  
 for (WebElement webElement : SecColumnList) {
	 System.out.println(webElement.getText());
 }
  
  for (WebElement obj : SecColumnList) {
	  String text = obj.getText();
	  if(text.contains("Developers")) {
		  obj.click();
		  break;
	  }
  }
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo']")));
  String curl = driver.getCurrentUrl();
  String title = driver.getTitle();
  //if(cUrl.contains("developers")); 
  if (title.contains("Developers")) {
	  System.out.println(" Test passed Successfully");
  }else {
	  System.out.println("Test failed");
  }
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  openURL("https://www.Ebay.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  

}
  }


