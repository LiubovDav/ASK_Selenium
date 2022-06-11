package definitions;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class assignmentGroup {
    @And("I click on radio-button {string}")
    public void iClickOnRadioButton(String radioButton) {
        getDriver().findElement(By.xpath("//label[@class = 'mat-radio-label']")).click();
    }

    @And("I click Create new assignments button")
    public void iClickCreateNewAssignmentsButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Assignment')]")).click();
    }

    @And("I click Group filter {string}")
    public void iClickGroupFilter(String groupFilter) throws InterruptedException {
        Thread.sleep(5000);

        getDriver().findElement(By.xpath("(//*[@class='mat-select-value'])[1]")).click();
        getDriver().findElement(By.xpath("//span[@class='mat-option-text'][text() = '"+groupFilter+"']")).click();
    }

    @And("I select the option in the drop-down list {string}")
    public void iSelectTheOptionInTheDropDownList(String selectQuizToAssign) {
        getDriver().findElement(By.xpath("(//*[@class = 'mat-option-text'])[1]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'"+selectQuizToAssign+"')]")).sendKeys(selectQuizToAssign);
    }

    @And("I click the button Select All")
    public void iClickTheButtonSelectAll() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Select All')]")).click();
    }

    @And("I click the button Give assignment")
    public void iClickTheButtonGiveAssignment() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]"));
    }
}

