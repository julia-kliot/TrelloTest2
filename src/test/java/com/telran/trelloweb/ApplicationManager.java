package com.telran.trelloweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {

    WebDriver wd;

    UseHelper user;
    BoardHelper board;




    public UseHelper getUser() {
        return user;
    }

    public BoardHelper getBoard() {
        return board;
    }

    protected void init() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\TrelloTest2\\chromedriver.exe");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");

        board= new BoardHelper(wd);
        user= new UseHelper(wd);

        user.login("juliakliot.jk@gmail.com","misha240613");

    }

    protected void stop() {
        wd.quit();
    }

}
