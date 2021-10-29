package com.telran.trelloweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\TrelloTest2\\chromedriver.exe");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");
        login("juliakliot.jk@gmail.com","misha240613");
    }

    public void type(By locator2, String text) {
        click(locator2);
        wd.findElement(locator2).clear();
        wd.findElement(locator2).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void login(String user, String password) throws InterruptedException {
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("#user"), user);
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.name("password"), password);
        click(By.id("login-submit"));
        Thread.sleep(15000);
    }
    public void logOut() throws InterruptedException {
        click(By.cssSelector("[data-test-id='header-member-menu-button']"));
        click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
        click(By.cssSelector("#logout-submit"));
        wd.navigate().to("https://trello.com/");
        Thread.sleep(10000);
    }
    public boolean isLogged()  {
        return wd.findElements(By.cssSelector("[data-test-id='header-member-menu-button']")).size()>0;

    }

    @AfterClass
    public void tearDown(){
        //wd.close;
       // wd.quit();

    }

    protected void submitLogin() {
        click(By.id("login-submit"));
    }

    protected void fillLoginForm(String user, String password) throws InterruptedException {
        type(By.cssSelector("#user"), user);
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.name("password"), password);
    }

    protected void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    protected void closeBoard() {
        click(By.cssSelector(".js-close-board"));
        click(By.cssSelector(".js-confirm"));
        click(By.cssSelector("close-board-delete-board-button"));
        click(By.cssSelector("[data-test-id='close-board-delete-board-confirm-button'"));
    }

    protected void openMore() {
        click((By.cssSelector("js-open-more")));
    }

    protected void openSideMenuBar() {
        click(By.cssSelector(".js-show-sidebar"));
    }

    protected void clickOnTheFirstBoard() {
        click(By.cssSelector(".boards-page-board-section-list-item"));
    }

    public int getBoardCount() {
        return wd.findElements(By.cssSelector(".boards-page-board-section-list-item")).size()-1;
    }
}
