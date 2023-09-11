package au.maximo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class CompleteWithoutPostwafPage extends TestBaseUtils {
	@Test
	public static void completeWithoutPostwaf() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "WW7922320";

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
		// check the buttons before start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.startWork)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(report.priority4)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		
		// report Material

//		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
//		wait.until(ExpectedConditions.visibilityOf(report.addMaterial));
//		wait.until(ExpectedConditions.elementToBeClickable(report.addMaterial)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
//		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		
		// failure report
		wait.until(ExpectedConditions.visibilityOf(report.failureReport));
		wait.until(ExpectedConditions.elementToBeClickable(report.failureReport)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// refrigerant report
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsage));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantUsage)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.refrigerantpreWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

		// check the buttons after start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();

// Prewaf save
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.preWAF)).click();

		swipe();
		swipe();
		swipe();

		// authorize without technician
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.authorizeError, "no Technician"));

		swipeTop();
		swipeTop();
		swipeTop();

		// add technician validation
		wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.techAdd));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.techAdd)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.cardNumberBlank));
		if (prewaf.cardNumberBlank.isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("sss");
			wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.invalidCardNumber));
			if (prewaf.invalidCardNumber.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.cardNum)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("1234567891234567");
				wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.cardNumberMorethan10));
				if (prewaf.cardNumberMorethan10.isDisplayed()) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).clear();
					wait.until(ExpectedConditions.visibilityOf(prewaf.cardNum)).sendKeys("123");
					wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
					wait.until(ExpectedConditions.visibilityOf(prewaf.expiryDateBlank));
					if (prewaf.expiryDateBlank.isDisplayed()) {
						wait.until(ExpectedConditions.visibilityOf(prewaf.expiryDate));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.expiryDate)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
						
						wait.until(ExpectedConditions.visibilityOf(eta.futureDate));
						wait.until(ExpectedConditions.elementToBeClickable(eta.futureDate)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
					}
				}
			}
		}
		swipe();
		swipe();
		swipe();

		// authorize without site orientation
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.siteOrientationMandatory, "Site Orientation"));

		swipeTop();
		swipeTop();
		swipeTop();

		// select site orientation
		wait.until(ExpectedConditions.visibilityOf(prewaf.siteOrientation));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.siteOrientation)).click();

		swipe();
		swipe();
		swipe();

		// authorize without ppq1
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.pPEQ1, "Work Area"));
		// fill the ppq1
		wait.until(ExpectedConditions.visibilityOf(prewaf.ppeWorkarea));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.ppeWorkarea)).click();

		// authorize without workareaq2
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.workAreaQ2, "Work Area"));
		// select the workareaq2
		wait.until(ExpectedConditions.visibilityOf(prewaf.jsaWorkarea));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsaWorkarea)).click();

		// authorize without name
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.perName, "Person Name"));
		// select the name
		wait.until(ExpectedConditions.visibilityOf(prewaf.name)).sendKeys("manager");

		// authorize without payroll id
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.payRollId, "Payroll ID"));
		// fill the payroll id
		wait.until(ExpectedConditions.visibilityOf(prewaf.payRoll)).sendKeys("123456");

//		// authorize the prewaf
		wait.until(ExpectedConditions.visibilityOf(prewaf.techSave));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.techSave)).click();

		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();

//		// report Material
		
//		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
//		wait.until(ExpectedConditions.visibilityOf(report.addMaterial));
//		wait.until(ExpectedConditions.elementToBeClickable(report.addMaterial)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
//		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// failure report
		wait.until(ExpectedConditions.visibilityOf(report.failureReport));
		wait.until(ExpectedConditions.elementToBeClickable(report.failureReport)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// refrigerant report
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsage));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantUsage)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.refrigerantpreWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

//Prewaf authorize
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.preWAF)).click();
		swipe();
		swipe();
		swipe();

		// authorize without technician
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

		// after prewaf check buttons and WO status
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf));
		// report Material
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
		wait.until(ExpectedConditions.visibilityOf(report.addMaterial));
		wait.until(ExpectedConditions.elementToBeClickable(report.addMaterial)).click();
		wait.until(ExpectedConditions.visibilityOf(report.addMate));
		wait.until(ExpectedConditions.visibilityOf(report.description));
		wait.until(ExpectedConditions.visibilityOf(report.quantity));
		wait.until(ExpectedConditions.visibilityOf(report.transactionType));
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.materialDescIssue, "Description"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(report.addvalue1));
		wait.until(ExpectedConditions.elementToBeClickable(report.addvalue1)).sendKeys("test");
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.materialUnitCostIssue, "Material"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(report.materialIncrement));
		wait.until(ExpectedConditions.elementToBeClickable(report.materialIncrement)).click();
		wait.until(ExpectedConditions.visibilityOf(report.addvalue3));
		wait.until(ExpectedConditions.elementToBeClickable(report.addvalue3)).sendKeys("300");
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		// refrigerant report
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsage));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantUsage)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsagePage)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.hasRefrigerant)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantHandling)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantCheckBox));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantCheckBox)).click();
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(mvp.refrigerantErrorMsg, "Refrigerant Type"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.jsa1));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsa1)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantTypeR134A));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantTypeR134A)).click();
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(mvp.qtyErrorMsg, "Qty Used"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.qty));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.qty)).sendKeys("3");
		wait.until(ExpectedConditions.visibilityOf(report.addvalue1));
		wait.until(ExpectedConditions.elementToBeClickable(report.addvalue1)).sendKeys("98741");
		wait.until(ExpectedConditions.visibilityOf(report.addvalue2));
		wait.until(ExpectedConditions.elementToBeClickable(report.addvalue2)).sendKeys("908248");
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

		// complete work
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();

		// attachments
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.attachementError, "Attachments"));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg)).click();

		wait.until(ExpectedConditions.visibilityOf(workdetail.attachments));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.attachments)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.attachmentstxt));
		wait.until(ExpectedConditions.visibilityOf(workdetail.add));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.add)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.photos));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.photos)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.add_Photo));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.add_Photo)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.addButton));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.addButton)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

		// complete work
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();

		// failure report
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.failureIssue, "Problem"));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg)).click();

		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
		wait.until(ExpectedConditions.visibilityOf(report.failureReport));
		wait.until(ExpectedConditions.elementToBeClickable(report.failureReport)).click();
		wait.until(ExpectedConditions.visibilityOf(report.prob)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(report.cau)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(report.rem)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(report.causeReason));
		wait.until(ExpectedConditions.elementToBeClickable(report.causeReason)).click();

		wait.until(ExpectedConditions.visibilityOf(report.prob)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(report.cau)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(report.rem)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(report.remedy));
		wait.until(ExpectedConditions.elementToBeClickable(report.remedy)).click();
		wait.until(ExpectedConditions.visibilityOf(report.saveLaborTime));
		wait.until(ExpectedConditions.elementToBeClickable(report.saveLaborTime)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		wait.until(ExpectedConditions.visibilityOf(report.priority4)).isDisplayed();

		// complete work
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf));
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.completeWork)).click();

		// work log
		wait.until(ExpectedConditions.textToBePresentInElement(prewaf.workLogError, "Work Log"));
//		wait.until(ExpectedConditions.elementToBeClickable(workdetail.closeErrorMsg)).click();
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

// complete work without post waf
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

			wait.until(ExpectedConditions.visibilityOf(eta.techCOM)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf)).isEnabled();

			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		}

	

	// @AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
