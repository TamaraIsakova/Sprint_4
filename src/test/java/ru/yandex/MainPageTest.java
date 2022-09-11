package ru.yandex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.prartikum.MainPage;
import org.openqa.selenium.WebDriver;
import ru.yandex.prartikum.OrderPage;

import java.util.concurrent.TimeUnit;

public class ImportantQuestionTest {
    private WebDriver webDriver;
    @Before
    public void setup(){
        //настройки вэбдрайвера для хрома
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        //настройки вебдрайвера для мозиллы
       // WebDriverManager.firefoxdriver().setup();
      //  webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkQuestionTextPositiveResult1(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion1);
        boolean isDisplayed = MainPage.importantQuestion1;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void checkQuestionTextPositiveResult2(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion2);
        boolean isDisplayed = MainPage.importantQuestion2;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void checkQuestionTextPositiveResult3(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion3);
        boolean isDisplayed = MainPage.importantQuestion3;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void checkQuestionTextPositiveResult4(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion4);
        boolean isDisplayed = MainPage.importantQuestion4;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void checkQuestionTextPositiveResult5(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion5);
        boolean isDisplayed = MainPage.importantQuestion5;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void checkQuestionTextPositiveResult6(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.scrollToField();
        MainPage.clickQuestionField(MainPage.importantQuestion6);
        boolean isDisplayed = MainPage.importantQuestion6;
        Assert.assertTrue("Right answer not displayed", isDisplayed );

    }

    @Test
    public void orderPositiveValuesPositiveResult(){
        MainPage mainPage = new MainPage(webDriver);
        MainPage.clickCookieCloseButton();
        MainPage.clickHeaderOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        OrderPage.


    }

}
