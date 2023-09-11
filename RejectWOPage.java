package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class RejectWOPage extends TestBaseUtils {
	@Test
	public static void rejectwo() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String assignList = "WW7712758";
		String assignDetail = "WW7916132";
		String acceptList = "WW7921933";
		String acceptDetail = "WW7922650";
		String memo = "test";

		// search WO assign status
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(assignList);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		// assign list page
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.assignStatus)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.changeStatus));
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectStatus));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectStatus)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReasonError));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReason));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectReason)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectCommentError));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectComment)).sendKeys(memo);
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();

		// search WO assign status
		searchAgain();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(assignDetail);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		// assign detail page
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.assignStatus)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.changeStatus));
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectStatus));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectStatus)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReasonError));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReason));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectReason)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectCommentError));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.rejectComment)).sendKeys(memo);
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.reject));
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

		// search WO accept status
		searchAgain();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(acceptList);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		// accept list view
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.assignStatus)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.changeStatus));
		wait.until(ExpectedConditions.visibilityOf(mvp.accept));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.accept)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates)).isEnabled();
		try {
			wait.until(ExpectedConditions.visibilityOf(workdetail.acceptWork2)).isEnabled();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.acceptWork2)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(workdetail.acceptWork)).isEnabled();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.acceptWork)).click();
		} finally {
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectStatus));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectStatus)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReason));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectReason)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectComment)).sendKeys(memo);
			wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
			wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();

			// search wo accept status
			searchAgain();
			wait.until(ExpectedConditions.visibilityOf(search.searchWO));
			wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
			wait.until(ExpectedConditions.visibilityOf(search.searchWO));
			wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
			wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(acceptDetail);
			wait.until(ExpectedConditions.visibilityOf(search.filter));
			wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
			// accept detail page
			wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.assignStatus)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.changeStatus));
			wait.until(ExpectedConditions.visibilityOf(mvp.accept));
			wait.until(ExpectedConditions.elementToBeClickable(mvp.accept)).click();
			wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
			wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
			// asset
			wait.until(ExpectedConditions.visibilityOf(mvp.scan)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(mvp.information)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(mvp.edit)).isDisplayed();
			// accept to reject
			wait.until(ExpectedConditions.visibilityOf(workdetail.acceptWork)).isDisplayed();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.acceptWork)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.changeStatus));
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectStatus));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectStatus)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectReason));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.rejectReason)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.rejectComment)).sendKeys(memo);
			wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
			wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

		}
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
