package au.maximo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class AddmaterialPrewafExpiredPage extends TestBaseUtils {
	@Test
	public static void addmaterial() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "WW7641878";

		// search WO
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		
		//list page status check
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseList)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWafList)).isEnabled();
		
		//detail page
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		//check status and buttons after prewaf expired
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf)).isEnabled();

//		//postwaf is not authorize and prewaf expired
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
		
//		// Material -->postwaf error
//		wait.until(ExpectedConditions.visibilityOf(report.addMaterial));
//		wait.until(ExpectedConditions.elementToBeClickable(report.addMaterial)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(eta.postWAFIssue, "Post-Work WAF"));
//		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// failure -->postwaf error
		wait.until(ExpectedConditions.visibilityOf(report.failureReport));
		wait.until(ExpectedConditions.elementToBeClickable(report.failureReport)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(eta.postWAFIssue, "Post-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// refrigerant -->postwaf error
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsage));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantUsage)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(eta.refrigerantError, "Post-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		//worklog
		wait.until(ExpectedConditions.visibilityOf(workdetail.attachments)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(postwaf.waf)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.document));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.document)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.workLog)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(workdetail.addNotes)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.addNotes)).sendKeys("test");
		
		wait.until(ExpectedConditions.visibilityOf(workdetail.send));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.send)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.worklog1)).isDisplayed();

		// Authorize post waf
		wait.until(ExpectedConditions.visibilityOf(postwaf.waf));
		wait.until(ExpectedConditions.elementToBeClickable(postwaf.waf)).click();
		wait.until(ExpectedConditions.visibilityOf(postwaf.postWAFtxt));
		wait.until(ExpectedConditions.visibilityOf(postwaf.postWaf));
		wait.until(ExpectedConditions.elementToBeClickable(postwaf.postWaf)).click();
		wait.until(ExpectedConditions.visibilityOf(postwaf.postWAFPagetxt));
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(postwaf.payrollError, "Payroll"));
		wait.until(ExpectedConditions.textToBePresentInElement(postwaf.personNameError, "Person Name"));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.jsa));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsa)).click();
		wait.until(ExpectedConditions.visibilityOf(postwaf.rating));
		wait.until(ExpectedConditions.elementToBeClickable(postwaf.rating)).click();
		wait.until(ExpectedConditions.visibilityOf(postwaf.postWafcomment)).sendKeys("test");
		wait.until(ExpectedConditions.visibilityOf(eta.keyboardDown));
		wait.until(ExpectedConditions.elementToBeClickable(eta.keyboardDown)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.name)).sendKeys("manager");
		wait.until(ExpectedConditions.visibilityOf(prewaf.payRoll)).sendKeys("123456");
		wait.until(ExpectedConditions.visibilityOf(eta.keyboardDown));
		wait.until(ExpectedConditions.elementToBeClickable(eta.keyboardDown)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();

		//authorized postwaf and prewaf expired
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(prewaf.preWAF)).isEnabled();
		
		//reportpage
		wait.until(ExpectedConditions.visibilityOf(report.report));
		wait.until(ExpectedConditions.elementToBeClickable(report.report)).click();
		wait.until(ExpectedConditions.visibilityOf(report.reportWorkPage));
		// Material -->prewaf error
//		wait.until(ExpectedConditions.visibilityOf(report.addMaterial));
//		wait.until(ExpectedConditions.elementToBeClickable(report.addMaterial)).click();
//		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
//		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// failure -->prewaf error
		wait.until(ExpectedConditions.visibilityOf(report.failureReport));
		wait.until(ExpectedConditions.elementToBeClickable(report.failureReport)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.preWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		// refrigerant -->prewaf error
		wait.until(ExpectedConditions.visibilityOf(mvp.refrigerantUsage));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.refrigerantUsage)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(report.refrigerantpreWAFError, "Pre-Work WAF"));
		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		// worklog
		wait.until(ExpectedConditions.visibilityOf(workdetail.attachments)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(postwaf.waf)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.document));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.document)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.workLog)).isDisplayed();
		
			wait.until(ExpectedConditions.visibilityOf(workdetail.addNotes2)).isEnabled();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.addNotes2)).sendKeys("test");
		
		wait.until(ExpectedConditions.visibilityOf(workdetail.send));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.send)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.worklog2)).isDisplayed();

		// Authorize prewaf
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
						
						
//						//future date in next month
//						wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
						
						
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
		// authorize the prewaf
		wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
		
		//afetr prewaf
		wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork)).isEnabled();

		// Fill the Material
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
		// Fill the refrigerant 
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
		// Fill the failure code
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
		// worklog
		wait.until(ExpectedConditions.visibilityOf(workdetail.attachments)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(postwaf.waf)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.document));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.document)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.workLog)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.addNotestxt)).isDisplayed();
	
			wait.until(ExpectedConditions.visibilityOf(workdetail.addNotes3)).isEnabled();
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.addNotes3)).sendKeys("test");
		
		wait.until(ExpectedConditions.visibilityOf(workdetail.send));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.send)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.worklog3)).isDisplayed();

		// pause wo validation
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
		if (workdetail.pauseWork.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.pauseWork)).click();
			wait.until(ExpectedConditions.visibilityOf(report.labor));
			wait.until(ExpectedConditions.visibilityOf(report.labor1));
			wait.until(ExpectedConditions.visibilityOf(report.type));
			wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
			wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
			wait.until(ExpectedConditions.visibilityOf(eta.ETAReasonError));
			if (eta.ETAReasonError.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(eta.pauseReason));
				wait.until(ExpectedConditions.elementToBeClickable(eta.pauseReason)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.estimateSubmitted));
				wait.until(ExpectedConditions.elementToBeClickable(eta.estimateSubmitted)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
				wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
				wait.until(ExpectedConditions.visibilityOf(eta.ETAcompletionBlankError));
				if (eta.ETAcompletionBlankError.isDisplayed()) {
					wait.until(ExpectedConditions.visibilityOf(eta.etaDateForCompletion));
					wait.until(ExpectedConditions.elementToBeClickable(eta.etaDateForCompletion)).click();
					
//					//past date in previous month
//					wait.until(ExpectedConditions.visibilityOf(prewaf.previousMonth));
//					wait.until(ExpectedConditions.elementToBeClickable(prewaf.previousMonth)).click();
					
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
						
						
						//future date in next month
//						wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
						
						
						
						
						wait.until(ExpectedConditions.visibilityOf(eta.futureDate));
						wait.until(ExpectedConditions.elementToBeClickable(eta.futureDate)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
						wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
						wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
						wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
						wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
					}
				}
			}
		}
		//pause status
		wait.until(ExpectedConditions.visibilityOf(workdetail.pauseStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf)).isEnabled();
		//back to the list page
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		}
		
	
	

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}

}
