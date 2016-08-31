package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example  {
    public static void main(String[] args) {

//    	System.setProperty("webdriver.chrome.driver", "src/support/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://cvms1236.nwie.net/#/org/orgDemo");
        
        driver.findElement(By.id("sel_distribution_partner_type")).sendKeys("ORG");
        driver.findElement(By.id("sel_organization_type")).sendKeys("BG");
        driver.findElement(By.id("txt_organization_name")).sendKeys("AutoJava");
        driver.findElement(By.id("txt_street_name")).sendKeys("Nationwide blvd");
        driver.findElement(By.id("txt_organization_tax_id_number")).sendKeys("999999999");
        driver.findElement(By.id("txt_finra")).sendKeys("111111111");
        driver.findElement(By.id("txt_attention_1")).sendKeys("Java");
        driver.findElement(By.id("txt_business_address_line1_1")).sendKeys("1 oop street");
        driver.findElement(By.id("txt_business_address_line2_1")).sendKeys("suit 609");
        driver.findElement(By.id("txt_city_1")).sendKeys("Coloumbus");
        driver.findElement(By.id("sel_state_1")).sendKeys("OH");
        driver.findElement(By.id("txt_county_1")).sendKeys("Franklyn");
        driver.findElement(By.id("txt_zip_code_1")).sendKeys("43215");
        driver.findElement(By.id("txt_business_phone_1")).sendKeys("6141111111");
        driver.findElement(By.id("txt_business_fax_1")).sendKeys("6142222222");
        driver.findElement(By.id("txt_business_email_1")).sendKeys("javabean@gmail.com");
        driver.findElement(By.id("rdo_business_email_1")).click();
        
        driver.findElement(By.id("btn_add_another_address")).click();
        driver.findElement(By.id("sel_address_type_2")).sendKeys("CML");
        driver.findElement(By.id("txt_attention_2")).sendKeys("Java");
        driver.findElement(By.id("txt_business_address_line1_2")).sendKeys("2 oop street");
        driver.findElement(By.id("txt_business_address_line2_2")).sendKeys("suit 610");
        driver.findElement(By.id("txt_city_2")).sendKeys("Coloumbus");
        driver.findElement(By.id("sel_state_2")).sendKeys("OH");
        driver.findElement(By.id("txt_county_2")).sendKeys("Franklyn");
        driver.findElement(By.id("txt_zip_code_2")).sendKeys("43215");
        driver.findElement(By.id("txt_business_phone_2")).sendKeys("6143333333");
        driver.findElement(By.id("txt_business_fax_2")).sendKeys("6144444444");
        driver.findElement(By.id("txt_business_email_2")).sendKeys("javabean@yahoo.com");
        driver.findElement(By.id("rdo_business_phone_2")).click();

        driver.findElement(By.id("btn_save")).click();

        driver.quit();
    }
}