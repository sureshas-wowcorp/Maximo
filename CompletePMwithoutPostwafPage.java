package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class CompletePMwithoutPostwafPage extends TestBaseUtils {
	@Test
	public static void completePM() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "WW8504327";
		String memo = "test";

//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates));
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
//		// check the buttons
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startWorkList)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravelList)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
//
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
//		// check the buttons
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
//
//		// task status
//		wait.until(ExpectedConditions.visibilityOf(mvp.taskTouchpoints)).isEnabled();
//		wait.until(ExpectedConditions.elementToBeClickable(mvp.taskTouchpoints)).click();
//		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatus)).isDisplayed();
//
//		// taskpage_Complete
//		for (int i = 0; i < 3; i++) {
//			mvp.thumbsUP.click();
//			Thread.sleep(2000);
//		}
//
//		wait.until(ExpectedConditions.visibilityOf(mvp.goBack));
//		wait.until(ExpectedConditions.elementToBeClickable(mvp.goBack)).click();
//
//		// check the buttons before start work
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
//		// click start work
//		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
//		wait.until(ExpectedConditions.elementToBeClickable(workdetail.startWork)).click();
//
//		// check the buttons after start work
//		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
//		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
//
//		// Prewaf
//		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.preWAF)).click();
//		swipe();
//		swipe();
//		swipe();
//
//		// authorize without technician
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.authorizeError, "no Technician"));
//
//		swipeTop();
//		swipeTop();
//		swipeTop();
//
//		// add technician validation
//		wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
//		wait.until(ExpectedConditions.visibilityOf(prewaf.techAdd));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.techAdd)).click();
//		wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
//		wait.until(ExpectedConditions.visibilityOf(prewaf.cardNumberBlank));
//		if (prewaf.cardNumberBlank.isDisplayed()) {
//			wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("sss");
//			wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
//			wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
//			wait.until(ExpectedConditions.visibilityOf(prewaf.invalidCardNumber));
//			if (prewaf.invalidCardNumber.isDisplayed()) {
//				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum));
//				wait.until(ExpectedConditions.elementToBeClickable(prewaf.cardNum)).click();
//				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("1234567891234567");
//				wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
//				wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
//				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNumberMorethan10));
//				if (prewaf.cardNumberMorethan10.isDisplayed()) {
//					wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).clear();
//					wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("123");
//					wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
//					wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
//					wait.until(ExpectedConditions.visibilityOf(prewaf.expiryDateBlank));
//					if (prewaf.expiryDateBlank.isDisplayed()) {
//						wait.until(ExpectedConditions.visibilityOf(prewaf.expiryDate));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.expiryDate)).click();
//						wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
//						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
//
//						wait.until(ExpectedConditions.visibilityOf(eta.futureDate));
//						wait.until(ExpectedConditions.elementToBeClickable(eta.futureDate)).click();
//						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
//						wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
//						wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
//					}
//				}
//			}
//		}
//		swipe();
//		swipe();
//		swipe();
//
//		// authorize without site orientation
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.siteOrientationMandatory, "Site Orientation"));
//
//		swipeTop();
//		swipeTop();
//		swipeTop();
//
//		// select site orientation
//		wait.until(ExpectedConditions.visibilityOf(prewaf.siteOrientation));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.siteOrientation)).click();
//
//		swipe();
//		swipe();
//		swipe();
//
//		// authorize without ppq1
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.pPEQ1, "Work Area"));
//		// fill the ppq1
//		wait.until(ExpectedConditions.visibilityOf(prewaf.ppeWorkarea));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.ppeWorkarea)).click();
//
//		// authorize without workareaq2
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.workAreaQ2, "Work Area"));
//		// select the workareaq2
//		wait.until(ExpectedConditions.visibilityOf(prewaf.jsaWorkarea));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsaWorkarea)).click();
//
//		// authorize without name
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.perName, "Person Name"));
//		// select the name
//		wait.until(ExpectedConditions.visibilityOf(prewaf.name)).sendKeys("manager");
//
//		// authorize without payroll id
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.payRollId, "Payroll ID"));
//		// fill the payroll id
//		wait.until(ExpectedConditions.visibilityOf(prewaf.payRoll)).sendKeys("123456");
//
//		// authorize the prewaf
//		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
//
//		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
//		// after prewaf check buttons and WO status
//		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
//		if (workdetail.inprogressStatus.isDisplayed()) {
//			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
//			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
//		}
//
//		// complete work
//		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
//		wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();
//
//		// complete task error
//		try {
//			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.CompleteTaskError, "incomplete tasks"));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg));
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// task status
//			wait.until(ExpectedConditions.visibilityOf(mvp.taskTouchpoints)).isEnabled();
//			wait.until(ExpectedConditions.elementToBeClickable(mvp.taskTouchpoints)).click();
//			wait.until(ExpectedConditions.visibilityOf(mvp.taskStatus)).isDisplayed();
//			// task status changed to complete
//			for (int i = 0; i < 1; i++) {
//				wait.until(ExpectedConditions.visibilityOf(mvp.thumbsUP));
//				wait.until(ExpectedConditions.elementToBeClickable(mvp.thumbsUP)).click();
//			}
//			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
//			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
//
//			// complete work
//			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();
//
//			// attachments
//			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.attachementErrorinPM, "Attachments"));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg));
//
//			wait.until(ExpectedConditions.visibilityOf(workdetail.attachments));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.attachments)).click();
//			wait.until(ExpectedConditions.visibilityOf(workdetail.add));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.add)).click();
//			wait.until(ExpectedConditions.visibilityOf(workdetail.photos));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.photos)).click();
//			wait.until(ExpectedConditions.visibilityOf(workdetail.add_Photo));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.add_Photo)).click();
//			wait.until(ExpectedConditions.visibilityOf(workdetail.addButton));
//			wait.until(ExpectedConditions.elementToBeClickable(workdetail.addButton)).click();
//			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
//			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

			// complete work
			wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
			if (workdetail.inprogressStatus.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
				wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
			}

			// complete work
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();

			// work log
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.workLogError, "Work"));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.attachments)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(postwaf.waf)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.document));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.document)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.workLog)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.addNotestxt)).isDisplayed();

			wait.until(ExpectedConditions.visibilityOf(workdetail.addNotes)).isEnabled();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.addNotes)).sendKeys("test");

			wait.until(ExpectedConditions.visibilityOf(workdetail.send));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.send)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.worklog1)).isDisplayed();

			// complete work with post waf
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWorkOrder));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWorkOrder)).click();
			wait.until(ExpectedConditions.visibilityOf(workdetail.ok));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.ok)).click();
			wait.until(ExpectedConditions.visibilityOf(report.labor)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(prewaf.tech1)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
			wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.postWAFCompletion)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.No));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.No)).click();

			wait.until(ExpectedConditions.elementToBeClickable(eta.techCOM));
			eta.techCOM.isDisplayed();

			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

			// assign wo
			wait.until(ExpectedConditions.visibilityOf(search.woDetails));
			wait.until(ExpectedConditions.elementToBeClickable(search.woDetails)).click();
			wait.until(ExpectedConditions.visibilityOf(search.assignedWO));
			wait.until(ExpectedConditions.elementToBeClickable(search.assignedWO)).click();
		}

//	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
