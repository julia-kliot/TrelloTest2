package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseHelper extends HelperBase{

    public UseHelper(WebDriver wd) {
        super(wd);
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

    public void submitLogin() {
        click(By.id("login-submit"));
    }

    public void fillLoginForm(String user, String password) throws InterruptedException {
        type(By.cssSelector("#user"), user);
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.name("password"), password);
    }

   public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }
}
