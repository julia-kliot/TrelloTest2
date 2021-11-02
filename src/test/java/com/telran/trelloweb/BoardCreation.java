package com.telran.trelloweb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {

@Test
public void testBoardCreation1() throws InterruptedException {
    int boardCountBeforeCreation = app.getBoard().getBoardCount();
    app.getBoard().initBoardCreation();
    app.getBoard().fillBoardForm("board1");


    app.getBoard().returnToHomePage();
    int boardCountAfterCreation = app.getBoard().getBoardCount();

    Assert.assertEquals(boardCountBeforeCreation,boardCountAfterCreation+1);
}

    @Test(enabled = false)
    public void testBoardCreation2() throws InterruptedException {
        int boardCountBeforeCreation = app.getBoard().getBoardCount();
        app.getBoard().initBoardCreation();
        app.getBoard().fillBoardForm("");


        app.getBoard().returnToHomePage();
        int boardCountAfterCreation = app.getBoard().getBoardCount();

        Assert.assertEquals(boardCountBeforeCreation,boardCountAfterCreation+1);
    }

}
