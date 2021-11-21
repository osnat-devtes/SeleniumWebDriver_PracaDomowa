package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2_Edge {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","src/main/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.xpath("//*[@id = \"_desktop_user_info\"]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id = \"content\"]/div/a")).click();
        driver.navigate().back();
        driver.navigate().back();
    }
}
