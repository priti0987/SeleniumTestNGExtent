package Pages;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import static Tests.SeleniumTest.*;
import static Tests.SeleniumTest.driver;
public class Products {
    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportsShoes_xpath = "/html/body/div[3]/center/h2";
    public static String sneaker_xpath = "/html/body/div[4]/center/h2";

    public static String formalShoes_dropdown_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String sportsShoes_dropdown_xpath = "/html/body/div[3]/center/div/i[1]";
    public static String sneaker_dropdown_xpath = "/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_shoesName_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportsShoes_shoesName_xpath = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneakers_shoesName_xpath = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalShoes_verifyTitle(){
        String expectedTitleFs ="Formal Shoes";
        String actualTitleFs = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFs,actualTitleFs);
        if (expectedTitleFs.equals(actualTitleFs))
        {
            test.log(Status.PASS,"Test Pass for validation of Formal Shoes");
        }
    }
    public static void sportsShoes_verifyTitle(){
        String expectedTitleSs ="Sports Shoes";
        String actualTitleSs = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSs,actualTitleSs);
        if (expectedTitleSs.equals(actualTitleSs))
        {
            test.log(Status.PASS,"Test Pass for validation of Sports Shoes");
        }
    }
    public static void sneaker_verifyTitle(){
        String expectedTitleS ="Sneakers";
        String actualTitleS = driver.findElement(By.xpath(sneaker_xpath)).getText();
        Assert.assertEquals(expectedTitleS,actualTitleS);
        if (expectedTitleS.equals(actualTitleS))
        {
            test.log(Status.PASS,"Test Pass for validation of sneakers Shoes");
        }
    }

    public static void verifyFormalShoesName(){
        String expectedFormalShoes = "Classic Cheltenham";
        driver.findElement(By.xpath(formalShoes_dropdown_xpath)).click();
        String actualFormalShoes = driver.findElement(By.xpath(formalShoes_shoesName_xpath)).getText();
        Assert.assertEquals(expectedFormalShoes,actualFormalShoes.trim());
        if (expectedFormalShoes.equals(actualFormalShoes))
        {
            test.log(Status.PASS,"Test Pass for validation of Formal Shoes name");
        }
    }
    public static void verifySportsShoesName(){
        String expectedSportsShoes = "Ultimate";
        driver.findElement(By.xpath(sportsShoes_dropdown_xpath)).click();
        String actualSportsShoes = driver.findElement(By.xpath(sportsShoes_shoesName_xpath  )).getText();
        Assert.assertEquals(expectedSportsShoes,actualSportsShoes.trim());
        if (expectedSportsShoes.equals(actualSportsShoes))
        {
            test.log(Status.PASS,"Test Pass for validation of sports Shoes");
        }
    }
    public static void verifySneakersName(){
        String expectedSneakers = "Arcdh232ivo";
        driver.findElement(By.xpath(sneaker_dropdown_xpath)).click();
        String actualSneakers = driver.findElement(By.xpath(sneakers_shoesName_xpath)).getText();
        Assert.assertEquals(expectedSneakers,actualSneakers.trim());
        if (expectedSneakers.equals(actualSneakers))
        {
            test.log(Status.PASS,"Test Pass for validation of sneakers");
        }
        else
        {
            test.log(Status.FAIL,"Fail");
        }
    }


}
