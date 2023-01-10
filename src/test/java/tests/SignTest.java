package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aefranca\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://www.juliodelima.com.br/taskit/");

        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("login-sign-in")).sendKeys("aefranca");
        navegador.findElement(By.id("password-sign-in")).sendKeys("85850219");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals("Hi, Aline França", saudacao);

        navegador.quit();
    }
}
