package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase{
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void closeBoard() {
        click(By.cssSelector(".js-close-board"));
        click(By.cssSelector(".js-confirm"));
        click(By.cssSelector("close-board-delete-board-button"));
        click(By.cssSelector("[data-test-id='close-board-delete-board-confirm-button'"));
    }

    public void openMore() {
        click((By.cssSelector("js-open-more")));
    }

    public void openSideMenuBar() {
        click(By.cssSelector(".js-show-sidebar"));
    }

    public void clickOnTheFirstBoard() {
        click(By.cssSelector(".boards-page-board-section-list-item"));
    }

    public int getBoardCount() {
        return wd.findElements(By.cssSelector(".boards-page-board-section-list-item")).size()-1;
    }

    public void fillBoardForm(String bordName) throws InterruptedException {
        type(By.cssSelector("[data-test-id='create-board-title-input']"), bordName);
//confirmBoardCreation
        Thread.sleep(15000);
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    }

    public void initBoardCreation() {
        click(By.cssSelector("[data-test-id='header-create-menu-button']"));
//selectCreateBoard
        click((By.cssSelector("[aria-label='BoardIcon']")));
    }

    public void returnToHomePage() {
        click(By.cssSelector("._9Bfh6AVH84yAZe"));
    }
}
