package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class MessagePage extends RunCucumberTest {
    WebDriver driver;

    private By subject_field = By.id("id_contact");
    private By fill_email_field = By.id("email");
    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");
    private By submit_button = By.id("submitMessage");


    public void acessScreenContact(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        Utils.waitElementBePresent(message_field, 20);
    }

    public void fillEmailCreate() {
        getDriver().findElement(fill_email_field).sendKeys(Utils.getRandomEmail());

    }

    public void fillSubject(String subject) {
        Select select_subject = new Select(getDriver().findElement(subject_field));
        select_subject.selectByVisibleText(subject);
    }

    public void fillMessage (String message){
        driver.findElement(message_field).sendKeys(message);
    }

    public void uploadFile (String pathFile){
        driver.findElement(upload_field).sendKeys(pathFile);
    }

    public void clickToSendMessage (){
        driver.findElement(submit_button).click();
    }

    public void validateMessage() {
        Utils.waitElementBePresent(By.className("home"), 20);
         getDriver().findElement(By.cssSelector("#center_column > p")).getText();

    }


}
