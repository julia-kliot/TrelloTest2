package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest1 extends TestBase {
    @AfterMethod
    public void preConditions(){
        
            logOut();
        }



    @Test
    public void testLogin() throws InterruptedException {
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("#user"), "juliakliot.jk@gmail.com");
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.name("password"), "misha240613");
        click(By.id("login-submit"));
        Thread.sleep(15000);


        Assert.assertTrue(wd.findElements(By.cssSelector("._2ft40Nx3NZII2i")).size() > 0);
    }

}
