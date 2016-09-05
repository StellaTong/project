package opal;

import org.omg.IOP.ExceptionDetailMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dongsidou on 2016/9/1.
 */
public class testselenium {

     public static void main(String[] args){

              System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
              WebDriver driver = new FirefoxDriver();
              driver.get("renah.buaa.edu.cn:8080/qpmtools/#/spc/create/XmR");
              WebDriverWait wait=new WebDriverWait(driver,10);
              wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='name']")));
              WebElement name = driver.findElement(By.xpath(".//*[@id='name']"));
              name.sendKeys("effort");
              Select selectorg = new Select(driver.findElement(By.xpath("//td[2]/select")));
              selectorg.selectByIndex(3);
              wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[3]/select")));
              Select selectpro = new Select(driver.findElement(By.xpath("//td[3]/select")));
              selectpro.selectByIndex(1);



           }




}
