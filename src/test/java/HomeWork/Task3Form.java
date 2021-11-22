package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Form {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement first_name = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        first_name.clear();
        first_name.sendKeys("Karol");

        WebElement last_name = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        last_name.clear();
        last_name.sendKeys("Kowalski");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        gender.click();

        WebElement birth_date = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        birth_date.clear();
        birth_date.sendKeys("05/22/2010");

        WebElement address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        address.clear();
        address.sendKeys("Prosta 51");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.clear();
        email.sendKeys("karol.kowalski@mailinator.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.clear();
        password.sendKeys("Pass123");

        WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        company.clear();
        company.sendKeys("Pass123");

        WebElement comment = driver.findElement(By.xpath("//*[@id=\"comment\"]"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

        WebElement role = driver.findElement(By.xpath("//*[@id=\"role\"]/option[2]"));
        role.click();

        WebElement job_expectation = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[4]"));
        job_expectation.click();

        WebElement development = driver.findElement(By.xpath("/html/body/div/div/form/div[11]/div/div[1]/label/input"));
        development.click();

        WebElement development1 = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[2]/label/input"));
        development1.click();

        WebElement development2 = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[6]/label"));
        development2.click();

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).submit();

    }
}
