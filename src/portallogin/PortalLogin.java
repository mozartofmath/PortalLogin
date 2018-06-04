/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portallogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.NoSuchElementException;
/**
 *
 * @author HP
 */
public class PortalLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        portalLogin();
    }
    public static void portalLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Books\\Software Engineering 2\\software II\\Selinium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://portal.aait.edu.et");
        
        WebElement emailtb = driver.findElement(By.name("UserName"));
        WebElement passwordtb = driver.findElement(By.name("Password"));
        
        emailtb.sendKeys("ATR/1234/08");
        //emailtb.click();
        
        passwordtb.sendKeys("1234");
        passwordtb.submit();
        try{
            Thread.sleep(5000);
        }catch(Exception e){
        
        }
        WebElement report = driver.findElement(By.id("ml2"));
        report.click();
        //driver.navigate().to("http://portal.aait.edu.et/Grade/GradeReport");
        
        //driver.close();
    }
}
