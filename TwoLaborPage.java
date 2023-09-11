package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class TwoLaborPage extends TestBaseUtils {
	@Test
	public static void twoLabor() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "ww7379144";

		// search WO
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravelList));
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus));
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();

//Tech lead
		wait.until(ExpectedConditions.visibilityOf(workdetail.attachments)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
		// start travel
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.startTravel)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.stopTravel));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.stopTravel)).click();
		wait.until(ExpectedConditions.visibilityOf(report.labor)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(eta.checkTheVisibility)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();

//two labor
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
		wait.until(ExpectedConditions.visibilityOf(report.addLabor));
		wait.until(ExpectedConditions.elementToBeClickable(report.addLabor)).click();
		
		wait.until(ExpectedConditions.visibilityOf(report.labor)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.tech1)).isEnabled();
		
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
		wait.until(ExpectedConditions.visibilityOf(report.secondLabor));
		wait.until(ExpectedConditions.elementToBeClickable(report.secondLabor)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		//start time error
		wait.until(ExpectedConditions.visibilityOf(report.startTimeError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(report.startTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.startTime)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		//end date error
		wait.until(ExpectedConditions.visibilityOf(report.endDateError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(report.endDate));
		wait.until(ExpectedConditions.elementToBeClickable(report.endDate)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		//end time error
		wait.until(ExpectedConditions.visibilityOf(report.endTimeError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(report.endTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.endTime)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
