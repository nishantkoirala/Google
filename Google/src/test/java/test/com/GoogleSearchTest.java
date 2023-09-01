/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nishant.koirala
 */
public class GoogleSearchTest {

    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    public GoogleSearchTest() {
    }

    @Test
    public void testGoogleSearch() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).click();
        driver.get("https://www.google.com/search?q=football&oq=football&aqs=chrome.0.69i59j0i67i131i433i650l2j0i67i650j0i67i131i433i650l2j0i67i650j46i67i650j0i67i131i433i650l2.5112j0j15&sourceid=chrome&ie=UTF-8");
        WebElement currentElement = driver.switchTo().activeElement();
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/div/div/div/a/h3"));currentElement.click();
        driver.get("https://en.wikipedia.org/wiki/Football");

//        driver.get("https://www.priceline.com/");
//        driver.findElement(By.xpath("//button[@id='tab-flights']/div/div/div[2]")).click();
//        driver.findElement(By.id("flights.0.startLocation-typeahead-downshift-container-input")).click();
//        WebElement currentElement = driver.switchTo().activeElement();
//        currentElement.click();
//        driver.findElement(By.xpath("//div[@id='flights.0.startLocation-typeahead-downshift-container-item-1']/div")).click();
//        driver.findElement(By.id("flights.0.startLocation-typeahead-downshift-container-input")).clear();
//        driver.findElement(By.id("flights.0.startLocation-typeahead-downshift-container-input")).sendKeys("Chicago, IL (ORD)");
//        driver.findElement(By.xpath("//div[@id='flights.0.endLocation-typeahead-downshift-container-item-0']/div")).click();
//        driver.findElement(By.id("flights.0.endLocation-typeahead-downshift-container-input")).clear();
//        driver.findElement(By.id("flights.0.endLocation-typeahead-downshift-container-input")).sendKeys("Tokyo, Japan (HND)");
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/button/div")).click();
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[7]/button/div")).click();
//        driver.findElement(By.id("flight-date-range-0")).click();
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div[10]/div/div/div[2]")).click();
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/button/div")).click();
//        driver.findElement(By.id("flight-date-range-0")).click();
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div[13]/div/div/div")).click();
//        driver.findElement(By.xpath("//div[@id='panel-flights']/form/div[2]/div[7]/button/div")).click();
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
//        driver.findElement(By.id("pass")).click();
//        driver.findElement(By.id("pass")).clear();
//        driver.findElement(By.id("pass")).sendKeys("asdas");
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys("ramasdasdas@gmail.com");
//        driver.findElement(By.id("u_0_5_WC")).click();
//        WebElement currentElement = driver.switchTo().activeElement();
//        currentElement.click();
//        driver.findElement(By.xpath("//div[@id='u_0_6_mU']/div/i"));
//
//        driver.get("https://www.google.com/search?q=cricket&oq=crick&aqs=chrome.0.69i59j69i64j69i57j35i39i650j46i20i131i199i263i433i465i512j46i67i131i433i650j0i67i131i433i650j46i131i433i512.3303j0j15&sourceid=chrome&ie=UTF-8");
//        WebElement currentElement = driver.switchTo().activeElement();
//        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3"));
//        currentElement.click();
//        driver.get("https://www.cricketwireless.com/");
//        driver.get(baseUrl + "chrome://newtab/");
//        driver.get("https://www.google.com/search?q=football&oq=football&aqs=chrome.0.69i59j0i67i131i433i650l2j0i67i650j0i67i131i433i650l2j0i67i650j46i67i650j0i67i131i433i650l2.5112j0j15&sourceid=chrome&ie=UTF-8");
//        WebElement currentElement = driver.switchTo().activeElement();
//        WebElement currentElement = driver.switchTo().activeElement();
//        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/a/h3"));
//        currentElement.click();
//        driver.get("https://en.wikipedia.org/wiki/Football");
//        driver.get("http://itexps.com/");
//        driver.get("https://www.itexps.net/");
//        driver.findElement(By.id("DrpDwnMn06label")).click();
//        driver.get("https://www.google.com/");
//        driver.findElement(By.id("APjFqb")).click();
//        driver.findElement(By.id("APjFqb")).clear();
//        driver.findElement(By.id("APjFqb")).sendKeys("Basketball");
//        driver.findElement(By.id("ERWdKc")).click();
//        driver.findElement(By.id("rso")).click();
//        driver.get("https://www.amazon.com/basketballs-basketball-courts/b?ie=UTF8&node=3396751");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

}
