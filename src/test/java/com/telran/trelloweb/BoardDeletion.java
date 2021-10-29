package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardDeletion extends TestBase {

    @Test
            public void deleteBoard() {
        int boardCountBeforeDeletion = getBoardCount();

        clickOnTheFirstBoard();
        openSideMenuBar();
        openMore();

        closeBoard();

        click(By.cssSelector("._2ft40Nx3NZII2i"));

        int boardCountAfterDeletion = getBoardCount();
        Assert.assertEquals(boardCountBeforeDeletion,boardCountAfterDeletion-1);

    }


}
