package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebInterfaceTests extends SeleniumWrapper {

    @Test
    public void testTitle() throws InterruptedException {
        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        assertEquals("Tic Tac Toe", driver.getTitle());
    }

    @Test
    public void testFirstPlayer() {
        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        wait = new WebDriverWait(driver, 5);

        String turn = driver.findElement(By.className("turn")).getText();

        wait = new WebDriverWait(driver, 5);

        assertEquals("Player 1 make your move.", turn);
    }

    @Test
    public void testXWinner() throws InterruptedException{

        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        wait = new WebDriverWait(driver, 5);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("1"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("3"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("5"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("6"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        String x = driver.findElement(By.className("info")).getText();

        wait = new WebDriverWait(driver, 5);

        assertEquals("X just won the game.", x);
    }


    @Test
    public void testNewGame() throws InterruptedException{
        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        wait = new WebDriverWait(driver, 5);

        String x = driver.findElement(By.className("info")).getText();

        wait = new WebDriverWait(driver, 5);

        assertEquals("", x);
    }

    @Test
    public void testOWinner() throws InterruptedException{

        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        wait = new WebDriverWait(driver, 5);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("1"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("5"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("4"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("8"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("7"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        String x = driver.findElement(By.className("info")).getText();

        wait = new WebDriverWait(driver, 5);

        assertEquals("O just won the game.", x);
    }


    @Test
    public void testDraw() throws InterruptedException{

        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        wait = new WebDriverWait(driver, 5);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("1"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("2"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("3"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("4"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("6"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("5"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("8"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        choice = driver.findElement(By.id("7"));
        choice.click();

        wait = new WebDriverWait(driver, 5);

        String x = driver.findElement(By.className("info")).getText();

        wait = new WebDriverWait(driver, 5);

        assertEquals("Draw!", x);
    }
}
