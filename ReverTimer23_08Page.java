package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class ReverTimer23_08Page extends TestBaseUtils{
	@Test
	public static void revertime() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "";

		// search WO
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		// check the buttons
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWorkList)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravelList)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();

		// start work
		// check the buttons and status before start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.startWork)).click();
		//check the buttons and status after start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(prewaf.revertTime)).isEnabled();
		//detail page to list page
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafList));
		//detail page
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(prewaf.revertTime)).isEnabled();
		
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.revertTime)).click();
		
		//click the revertime
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
		
		//detail page to list page
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
	}
	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
