package com.telran.trelloweb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected  ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterClass
    public void tearDown(){
        //wd.close;
       app.stop();

    }

}
