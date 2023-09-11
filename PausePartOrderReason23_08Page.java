package au.maximo.pages;

import java.io.Console;
import java.util.logging.Logger;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import au.maximo.utils.TestBaseUtils;

public class PausePartOrderReason23_08Page extends TestBaseUtils {

	static Logger logger = Logger.getLogger(PausePartOrderReason23_08Page.class.getName());

	@Test
	public void partsOrder() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "";

		// search WO
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
	
		wait.until(ExpectedConditions.elementToBeClickable(search.filter));
		search.filter.click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();

		// check the buttons before start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isDisplayed();
		if (workdetail.startWork.isEnabled() && workdetail.startTravel.isEnabled()) {
			System.out.println("Start Travel and Start Work is enabled");
		}
		// start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.startWork)).click();

		// check the buttons after start work
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
		if (workdetail.inprogressStatus.isDisplayed()) {
			if (prewaf.preWAF.isEnabled()) {
				System.out.println("PreWaf is enabled");
			}
		}

		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF));
		if (prewaf.preWAF.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.preWAF)).click();
		}
		swipe();
		swipe();
		swipe();

		// authorize without technician
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		prewaf.authorizeError.isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));

		swipeTop();
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
						
						//future date is in next month
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
		prewaf.siteOrientationMandatory.isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));

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
		prewaf.pPEQ1.isDisplayed();
		// fill the ppq1
		wait.until(ExpectedConditions.visibilityOf(prewaf.ppeWorkarea));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.ppeWorkarea)).click();

		// authorize without workareaq2
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		prewaf.workAreaQ2.isDisplayed();
		// select the workareaq2
		wait.until(ExpectedConditions.visibilityOf(prewaf.jsaWorkarea));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsaWorkarea)).click();

		// authorize without name
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		prewaf.perName.isDisplayed();
		// select the name
		wait.until(ExpectedConditions.visibilityOf(prewaf.name)).sendKeys("manager");

		// authorize without payroll id
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		prewaf.payRollId.isDisplayed();
		// fill the payroll id
		wait.until(ExpectedConditions.visibilityOf(prewaf.payRoll)).sendKeys("123456");

		// authorize the prewaf
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();

		
		
		
//		// hide payroll test2
//		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafDetail));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafDetail)).click();
//
//		swipe();
//		swipe();
//		swipe();
//
//		wait.until(ExpectedConditions.visibilityOf(prewaf.payrollEncrypt));
//		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		
		
	
		
		
		
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

		// check buttons and WO status
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
		if (workdetail.inprogressStatus.isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseStatus));
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
			if (workdetail.pauseStatus.isEnabled() && workdetail.completeWork.isEnabled()) {
				System.out.println("pause and complete work is enabled");
			}
		}

		// pause wo
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
		if (workdetail.pauseWork.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.pauseWork)).click();
			wait.until(ExpectedConditions.visibilityOf(eta.checkTheVisibility));
			wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
			wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
			wait.until(ExpectedConditions.visibilityOf(eta.ETAReasonError));
			if (eta.ETAReasonError.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(eta.pauseReason));
				wait.until(ExpectedConditions.elementToBeClickable(eta.pauseReason)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.partsOrder));
				wait.until(ExpectedConditions.elementToBeClickable(eta.partsOrder)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
				wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.ETAcompletionBlankError));
				if (eta.ETAcompletionBlankError.isDisplayed()) {
					wait.until(ExpectedConditions.visibilityOf(eta.etaDateForCompletion));
					wait.until(ExpectedConditions.elementToBeClickable(eta.etaDateForCompletion)).click();
					wait.until(ExpectedConditions.visibilityOf(eta.pastDateELA));
					wait.until(ExpectedConditions.elementToBeClickable(eta.pastDateELA)).click();
					wait.until(ExpectedConditions.visibilityOf(prewaf.done));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
					wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
					wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
					wait.until(ExpectedConditions.visibilityOf(eta.ETaCompletionError));
					if (eta.ETaCompletionError.isDisplayed()) {
						wait.until(ExpectedConditions.visibilityOf(eta.removePastDate));
						wait.until(ExpectedConditions.elementToBeClickable(eta.removePastDate)).click();
						wait.until(ExpectedConditions.visibilityOf(eta.etaDateForCompletion));
						wait.until(ExpectedConditions.elementToBeClickable(eta.etaDateForCompletion)).click();
						
//						//future date is in next month
//						wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
						
						
						
						wait.until(ExpectedConditions.visibilityOf(eta.futureDate));
						wait.until(ExpectedConditions.elementToBeClickable(eta.futureDate)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
						wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
						wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
						
						//test 2
//						wait.until(ExpectedConditions.visibilityOf(eta.memoError));
//						wait.until(ExpectedConditions.elementToBeClickable(eta.memoError)).click();
//						wait.until(ExpectedConditions.visibilityOf(eta.meMO)).sendKeys("test");
//						wait.until(ExpectedConditions.visibilityOf(eta.keyboardDown));
//						wait.until(ExpectedConditions.elementToBeClickable(eta.keyboardDown)).click();
//						wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
//						wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
					
						wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
					}
				}
			}
		}
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseStatus));
			wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
			wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel));
			wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf));
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
