package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.objects.WorkDetailObject;
import au.maximo.utils.TestBaseUtils;

public class AssetDetailTechcompPage extends TestBaseUtils {
	@Test
	public static void assetdetail() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);

		// search WO techcomp status
		wait.until(ExpectedConditions.visibilityOf(search.woDetails));
		wait.until(ExpectedConditions.elementToBeClickable(search.woDetails)).click();
		wait.until(ExpectedConditions.visibilityOf(search.techCOmpWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.techCOmpWO)).click();
		// check the status
	
			wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.techcompStatus)).isDisplayed();
		// asset details in tech comp status
		wait.until(ExpectedConditions.visibilityOf(mvp.scan)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.information)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.edit)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.upDown)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

		wait.until(ExpectedConditions.visibilityOf(search.woDetails));
		wait.until(ExpectedConditions.elementToBeClickable(search.woDetails)).click();
		wait.until(ExpectedConditions.visibilityOf(search.assignedWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.assignedWO)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}
}
