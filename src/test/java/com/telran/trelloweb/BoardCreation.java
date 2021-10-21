package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {
@Test
public void testBoardCreation1() throws InterruptedException {
//clickCreateByttonOnHeader
    click(By.cssSelector("[data-test-id='header-create-menu-button']"));
//selectCreateBoard
    click((By.cssSelector("[aria-label='BoardIcon']")));
//fieldBoardCreationForm
    type(By.cssSelector("[data-test-id='create-board-title-input']"),"board1");
//confirmBoardCreation
    click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    Thread.sleep(15000);
    //returnToHomePage
    //click(By.cssSelector("._2ft40Nx3NZII2i"));



}
}
