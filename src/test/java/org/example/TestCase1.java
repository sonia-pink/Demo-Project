package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase1 {
    public static WebDriver driver;

    @BeforeMethod
    public void launch()
    {
        System.setProperty("webdriver.gecko.driver","/home/ubuntu/Desktop/sonia/projects/JavaPrograms/resources/geckodriver");
        //System.setProperty("webdriver.gecko.driver","resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Made some changes ");
    }

    @Test
    public void test1()
    {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title1 " + driver.getTitle());
    }
    @Test
    public void test2()
    {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title2 " + driver.getTitle());
    }

    @Test
    public void test3()
    {
        driver.navigate().to("https://www.google.com/");
        System.out.println("I made changes to this test case through fork");
        System.out.println("Title3 " + driver.getTitle());
        
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
