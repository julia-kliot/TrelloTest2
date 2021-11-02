package com.telran.trelloweb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardDeletion extends TestBase {

    @Test
    public void deleteBoard() {
        int boardCountBeforeDeletion = app.getBoard().getBoardCount();

        app.getBoard().clickOnTheFirstBoard();
        app.getBoard().openSideMenuBar();
        app.getBoard().openMore();

        app.getBoard().closeBoard();
        app.getBoard().returnToHomePage();
        //click(By.cssSelector("._9Bfh6AVH84yAZe"));
        int boardCountAfterDeletion = app.getBoard().getBoardCount();
        Assert.assertEquals(boardCountBeforeDeletion, boardCountAfterDeletion - 1);

    }


}
