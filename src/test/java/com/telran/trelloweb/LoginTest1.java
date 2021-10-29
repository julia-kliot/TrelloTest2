package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1 extends TestBase {
@BeforeClass
    public void preConditions() throws InterruptedException {
        if (isLogged()) {
            logOut();
        }
    }




    @Test
    public void testLogin() throws InterruptedException {
        initLogin();
        fillLoginForm("juliakliot.jk@gmail.com", "misha240613");
        submitLogin();
        Thread.sleep(15000);


        Assert.assertTrue(wd.findElements(By.cssSelector("._2ft40Nx3NZII2i")).size() > 0);
    }
@Test(enabled = false)
    public void negativeLoginTestWithoutPassword() throws InterruptedException {
    initLogin();
    fillLoginForm("juliakliot.jk@gmail.com", "");
    submitLogin();
    Thread.sleep(15000);
}
}
