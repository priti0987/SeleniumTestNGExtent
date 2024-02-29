package Tests;

import Pages.Home;
import Pages.Products;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.*;

public class SeleniumTest {

    public static WebDriver driver = new ChromeDriver();
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    public static String url_1 = "https://anupdamoda.github.io/AceOnlineShoePortal/";
    @BeforeSuite
    public static void Setup() throws InterruptedException {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        //driver = new ChromeDriver();
        driver.get(url_1);
        driver.manage().window().maximize();
        Home.click_hamburger_menu();
        Home.click_onlineProducts();

    }

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/.../ExceImages/"+System.currentTimeMillis()+" png");
        String errflpath = Dest.getAbsolutePath();
//        FileUtils.copyFile(scrFile,Dest);
        return errflpath;
    }
    @Test
    void validateTitlesOnlineProducts() {
        test = extent.createTest("validate Titles Online Products","test description");
        Products.formalShoes_verifyTitle();
        Products.sportsShoes_verifyTitle();
        Products.sneaker_verifyTitle();
        extent.flush();
    }
    @Test
    void validateFirstFormalShoes() {
        test = extent.createTest("validate Titles Online Products:formal shoes first name","test description");

        Products.verifyFormalShoesName();
    }
    @Test
    void validateFirstSportsShoes() {
        test = extent.createTest("validate Titles Online Products:sports shoes name","test description");

        Products.verifySportsShoesName();
    }
    @Test
    void validateFirstSneakersShoes() {
        Products.verifySneakersName();
    }

    @AfterSuite
    void tearDown()
    {
        driver.quit();
        extent.flush();

    }
}
