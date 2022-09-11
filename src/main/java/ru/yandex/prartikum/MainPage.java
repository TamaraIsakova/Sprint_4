package ru.yandex.prartikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    private final WebDriver webDriver;
    // локатор кнопки "Заказать" в шапке сайта
    private By headerOrderButton = By.xpath(".//contains[(@class = 'Header_Nav' and @type='button' and (text()='Заказать')]");
    //локатор кнопки "Заказать" в середине страницы
    private By orderButton = By.xpath(".//contains[(@class = 'Home_FinishButton' and @type='button' and (text()='Заказать')]");
    //локаторы аккордеона "Вопросы о важном"
    private By importantQuestion1 = By.id("accordion__heading-0");
    private By importantQuestion2 = By.id("accordion__heading-1");
    private By importantQuestion3 = By.id("accordion__heading-2");
    private By importantQuestion4 = By.id("accordion__heading-3");
    private By importantQuestion5 = By.id("accordion__heading-4");
    private By importantQuestion6 = By.id("accordion__heading-5");
    //локатор кнопки принятия куки
    private static By cookieButton = By.xpath(".//button[(text() = 'да все привыкли')]");
    private WebDriver webDriver1;
    private By importantQuestion;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickCookieCloseButton() {
        webDriver.findElement(cookieButton).click();
    }

    public void scrollToField() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(importantQuestion1);
    }

    public String clickQuestionField(By importantQuestion) {
        this.importantQuestion = importantQuestion;
        webDriver.findElement(importantQuestion).click();
        String text = webDriver.findElement(importantQuestion).getText();
        return text;
    }

    public void clickHeaderOrderButton(){
        webDriver.findElement(headerOrderButton).click();
    }
}