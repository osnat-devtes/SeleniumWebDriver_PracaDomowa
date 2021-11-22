package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4FindElement {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");

        WebElement social_title = driver.findElement(By.xpath("//*[@id = \"customer_form\"]/section/div[1]/div[1]"));
        WebElement first_name = driver.findElement(By.xpath("//*[@id = \"customer_form\"]/section/div[2]/div[1]/input"));
        WebElement last_name = driver.findElement(By.xpath("//*[@id = \"customer_form\"]/section/div[3]/div[1]/input"));
        WebElement email = driver.findElement(By.xpath("//*[@id = \"customer_form\"]/section/div[4]/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input"));
        WebElement show = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/span/button"));
        WebElement birthdate = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[6]/div[1]/input"));
    }
}
