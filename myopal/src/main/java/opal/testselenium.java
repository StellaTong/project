package opal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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
         name.sendKeys("effor");
         Select selectorg = new Select(driver.findElement(By.xpath("//td[2]/select")));
         selectorg.selectByIndex(3);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[3]/select")));
         Select selectpro = new Select(driver.findElement(By.xpath("//td[3]/select")));
         selectpro.selectByIndex(1);
         WebElement Xname = driver.findElement(By.xpath("//tr[5]/td[1]/input"));
         Xname.sendKeys("X");
         WebElement Yname = driver.findElement(By.xpath("//tr[5]/td[2]/input"));
         Yname.sendKeys("Y");
         WebElement setnumber = driver.findElement(By.xpath("//tr[5]/td[4]/input[1]"));
         setnumber.sendKeys("8");
         WebElement submit = driver.findElement(By.xpath("//tr[5]/td[4]/input[2]"));
         submit.click();
         for(int i=2;i<=9;i++){
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[1]/td["+Integer.toString(i)+"]/input")));
             WebElement xvalue = driver.findElement(By.xpath("//tr[1]/td["+Integer.toString(i)+"]/input"));
             xvalue.sendKeys(Integer.toString(i-1));
         }
         for(int j=2;j<=9;j++){
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[2]/td["+Integer.toString(j)+"]/input")));
             WebElement yvalue = driver.findElement(By.xpath("//tr[2]/td["+Integer.toString(j)+"]/input"));
             yvalue.sendKeys(Integer.toString(j+1));
         }

         WebElement createxmr = driver.findElement(By.xpath("//div[1]/button[2]"));
         createxmr.click();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='controlPlot']/div/canvas[3]")));
         WebElement searchdata = driver.findElement(By.xpath(".//*[@id='controlPlot']/div/canvas[3]"));
         searchdata.click();



           }




}
