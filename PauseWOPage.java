package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class PauseWOPage extends TestBaseUtils {

	public static void pauseWO() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "WW8473912";
		String memo = "test";
		int i;

		// 23.08
//		wait.until(ExpectedConditions.visibilityOf(search.filterStatus));
//		wait.until(ExpectedConditions.elementToBeClickable(search.filterStatus)).click();
//		wait.until(ExpectedConditions.visibilityOf(search.priorityFilter));
//		wait.until(ExpectedConditions.visibilityOf(search.locationFilter));
//		wait.until(ExpectedConditions.visibilityOf(search.duedateFilter));
//		wait.until(ExpectedConditions.visibilityOf(search.tstPushbackfilter));
//		wait.until(ExpectedConditions.elementToBeClickable(search.tstPushbackfilter)).click();
//
//		wait.until(ExpectedConditions.visibilityOf(workdetail.tstPushBack)).isDisplayed();

// search WO
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(search.searchWO)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		// check the buttons
		wait.until(ExpectedConditions.visibilityOf(workdetail.startWorkList)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.startTravelList)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();

		// tst push back list page
		wait.until(ExpectedConditions.visibilityOf(workdetail.tstPushBack)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		// tst push back detail page
		wait.until(ExpectedConditions.visibilityOf(workdetail.tstPushBack)).isDisplayed();
		// asbestos risk
		wait.until(ExpectedConditions.visibilityOf(workdetail.asbestosRisk)).isDisplayed();
		// site
		wait.until(ExpectedConditions.visibilityOf(workdetail.site)).isDisplayed();
		// warranty
		wait.until(ExpectedConditions.visibilityOf(mvp.warranty)).isDisplayed();

//ETA or SLA
		swipe();
		// on behalf
		wait.until(ExpectedConditions.visibilityOf(workdetail.onBehalf)).isDisplayed();
		// ETA / SLA
		wait.until(ExpectedConditions.visibilityOf(eta.editELA));
		wait.until(ExpectedConditions.elementToBeClickable(eta.editELA)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaandReason));
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.dateELAError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.dateELA));
		wait.until(ExpectedConditions.elementToBeClickable(eta.dateELA)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		
		//past date is previous month
		wait.until(ExpectedConditions.visibilityOf(prewaf.previousMonth));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.previousMonth)).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(eta.pastDateELA));
		wait.until(ExpectedConditions.elementToBeClickable(eta.pastDateELA)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.pastDateError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.removeETASLADate));
		wait.until(ExpectedConditions.elementToBeClickable(eta.removeETASLADate)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.dateELA));
		wait.until(ExpectedConditions.elementToBeClickable(eta.dateELA)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		
		
//		//past date is previous month
//		wait.until(ExpectedConditions.visibilityOf(prewaf.previousMonth));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.previousMonth)).click();
				
				
//		//past date is previous month
//		wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//		wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
				
				
		wait.until(ExpectedConditions.visibilityOf(eta.currentDate));
		wait.until(ExpectedConditions.elementToBeClickable(eta.currentDate)).click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.done));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.reasonError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(eta.commentELA)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(eta.commentELA)).sendKeys(memo);
		wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
		wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.tstPushBack)).isDisplayed();

//asset information
		swipe();
		wait.until(ExpectedConditions.visibilityOf(mvp.information)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.information)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetTagText)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetDescription)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetCode)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.warrantyType)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.warrantyExpiryDate)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.wowLborWarrantyVendor)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.landlordLborWarrantyVendor)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.partsWarrantyVendor)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.manufacturer)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.model)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.serialNumber)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.installDate)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.estimatedEOL)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetBack));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetBack)).click();

// asset up
		swipe();
		wait.until(ExpectedConditions.visibilityOf(mvp.scan)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.information)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.edit)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.upDown)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.up)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.upDown));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.upDown)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetStatustxt));
		wait.until(ExpectedConditions.visibilityOf(mvp.downArrow));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.downArrow)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.down)).isDisplayed();
// asset down
		swipe();
		wait.until(ExpectedConditions.visibilityOf(mvp.down)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.upDown));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.upDown)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetStatustxt));
		wait.until(ExpectedConditions.visibilityOf(mvp.upArrow));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.upArrow)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.up)).isDisplayed();

// update asset
		swipe();
		wait.until(ExpectedConditions.visibilityOf(mvp.edit));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.edit)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.updateAssettxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetTagText)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assettxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.updateAssetError)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assettxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetLookup)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.site2));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.site2)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assettxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).isEnabled();
		mvp.statusSave.click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemErrorMsg)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.problemCodeLookup));
		mvp.problemCodeLookup.click();
		wait.until(ExpectedConditions.visibilityOf(mvp.other));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.other));
		mvp.other.click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave));
		mvp.statusSave.click();
		wait.until(ExpectedConditions.visibilityOf(mvp.causeErrormsg)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.causetxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.causeLookup)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.causeLookup));
		mvp.causeLookup.click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.other1)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.other)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.other)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.scan)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave));
		mvp.statusSave.click();
		wait.until(ExpectedConditions.visibilityOf(mvp.remedyErrormsg)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.remedytxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.remedyLookup)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.remedyLookup));
		mvp.remedyLookup.click();
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.other1)).isEnabled();
		wait.until(ExpectedConditions.visibilityOf(mvp.other)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.other)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.scan)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.remedytxt)).isDisplayed();

			wait.until(ExpectedConditions.visibilityOf(mvp.remarks));
			wait.until(ExpectedConditions.elementToBeClickable(mvp.remarks)).sendKeys(
					"The application of technology, programs, robotics or processes to achieve outcomes with minimal human input.");
		
			wait.until(ExpectedConditions.visibilityOf(mvp.remarksValidation));
			wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
			wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

// High Risk
			// check the buttons
			swipeTop();
			wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.assignStatus)).isDisplayed();
			// start work
			wait.until(ExpectedConditions.visibilityOf(workdetail.startWork));
			wait.until(ExpectedConditions.elementToBeClickable(workdetail.startWork)).click();

			// Prewaf
			wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
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
							wait.until(ExpectedConditions.visibilityOf(prewaf.done));
							
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
			wait.until(
					ExpectedConditions.textToBePresentInElement(prewaf.siteOrientationMandatory, "Site Orientation"));
			swipeTop();
			swipeTop();
			swipeTop();
			// select site orientation
			wait.until(ExpectedConditions.visibilityOf(prewaf.siteOrientation));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.siteOrientation)).click();
			// hot works
			wait.until(ExpectedConditions.visibilityOf(prewaf.hot_Works_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.hot_Works_check)).click();
			swipe();
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.hotWorksError, "Hot Works"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.hot_Works));
			if (prewaf.hot_Works.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 7; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			swipe();
			swipe();
			for (i = 0; i < 5; i++) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.jsaandSWMS));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsaandSWMS)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.yesWorkpermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.yesWorkpermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			// working from heights
			wait.until(ExpectedConditions.visibilityOf(prewaf.working_from_heights_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.working_from_heights_check)).click();
			swipe();
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.workfromheightsError, "Work from Height"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.working_From_Height));
			if (prewaf.working_From_Height.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 7; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
				wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			}
			// Electrical
			wait.until(ExpectedConditions.visibilityOf(prewaf.electrical_Works_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.electrical_Works_check)).click();
			swipe();
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.electricError, "Electric Works"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.electrical_Works));
			if (prewaf.electrical_Works.isEnabled()) {

				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 5; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			// Gas works
			wait.until(ExpectedConditions.visibilityOf(prewaf.gas_Works_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.gas_Works_check)).click();
			swipe();
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.gasworksError, "Gas Works"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.gas_Works));
			if (prewaf.gas_Works.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 7; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			// Imparirment
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.impairment_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.impairment_check)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.brick, prewaf.asbestos));
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.impairmentError, "Impairment"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.impairment));
			if (prewaf.impairment.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 5; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			// brick
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.brick_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.brick_check)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.brickError, "Brick"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.brick));
			if (prewaf.brick.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 6; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			// Asbestos
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.asbestos_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.asbestos_check)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.asbestosError, "Asbestos"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.asbestos));
			if (prewaf.asbestos.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 4; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.impairment, prewaf.brick, prewaf.asbestos));
			// confined_Space
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.asbestos, prewaf.confined_Space));
			wait.until(ExpectedConditions.visibilityOf(prewaf.confined_Space_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.confined_Space_check)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.asbestos, prewaf.confined_Space));
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.confinedError, "Confined"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.confined_Space));
			if (prewaf.confined_Space.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.tech1)).click();
				for (i = 0; i < 7; i++) {
					wait.until(ExpectedConditions.visibilityOf(prewaf.fireServiceForm));
					wait.until(ExpectedConditions.elementToBeClickable(prewaf.fireServiceForm)).click();
				}
			}
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.asbestos, prewaf.confined_Space));
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.asbestos, prewaf.confined_Space));
			// other
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.other, prewaf.work));
			wait.until(ExpectedConditions.visibilityOf(prewaf.others_check));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.others_check)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.authorize));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.authorize)).click();
			wait.until(ExpectedConditions.textToBePresentInElement(prewaf.otherError, "Other"));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.closeErrormsg)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.workPermit));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.workPermit)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.other));
			if (prewaf.other.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(prewaf.jsa1));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.jsa1)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.others_desc));
				prewaf.others_desc.sendKeys(memo);
				wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
				wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
				wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
			}
			swipe();
			swipe();
			swipe();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.other, prewaf.work));
			wait.until(ExpectedConditions.visibilityOf(prewaf.uncheck));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.uncheck)).click();
			wait.until(ExpectedConditions.visibilityOfAllElements(prewaf.other, prewaf.work));
			// prewaf work area
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
			// after prewaf check buttons and WO status
			wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
			if (workdetail.inprogressStatus.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
				wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));
			}

// Multi prewaf
			// postwaf
			wait.until(ExpectedConditions.visibilityOf(postwaf.waf));
			wait.until(ExpectedConditions.elementToBeClickable(postwaf.waf)).click();
			wait.until(ExpectedConditions.visibilityOf(postwaf.assetWO));
			wait.until(ExpectedConditions.elementToBeClickable(postwaf.assetWO)).click();
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
			// inprogressAfterPostwaf
			wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork)).isEnabled();
			// Prewaf
			wait.until(ExpectedConditions.visibilityOf(postwaf.waf));
			wait.until(ExpectedConditions.elementToBeClickable(postwaf.waf)).click();
			wait.until(ExpectedConditions.visibilityOf(prewaf.preWAFAdd));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.preWAFAdd)).click();
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
							wait.until(ExpectedConditions.visibilityOf(prewaf.done));
							
							
//							//future date is in next month
//							wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//							wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
							
							
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
			wait.until(
					ExpectedConditions.textToBePresentInElement(prewaf.siteOrientationMandatory, "Site Orientation"));
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
			// after prewaf check buttons and WO status
			wait.until(ExpectedConditions.visibilityOf(workdetail.inprogressStatus));
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
			wait.until(ExpectedConditions.visibilityOf(workdetail.completeWork));

			// pause wo
			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
			if (workdetail.pauseWork.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(workdetail.pauseWork));
				wait.until(ExpectedConditions.elementToBeClickable(workdetail.pauseWork)).click();
				wait.until(ExpectedConditions.visibilityOf(report.labor)).isDisplayed();
				wait.until(ExpectedConditions.visibilityOf(prewaf.tech1)).isEnabled();
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
						wait.until(ExpectedConditions.visibilityOf(prewaf.done));
						
						
//						//past date is previous month
//						wait.until(ExpectedConditions.visibilityOf(prewaf.previousMonth));
//						wait.until(ExpectedConditions.elementToBeClickable(prewaf.previousMonth)).click();
						
						
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
							wait.until(ExpectedConditions.visibilityOf(prewaf.done));
							
							
//							//future date is in next month
//							wait.until(ExpectedConditions.visibilityOf(prewaf.nextMonth));
//							wait.until(ExpectedConditions.elementToBeClickable(prewaf.nextMonth)).click();
							
							
							wait.until(ExpectedConditions.visibilityOf(eta.futureDate));
							wait.until(ExpectedConditions.elementToBeClickable(eta.futureDate)).click();
							wait.until(ExpectedConditions.visibilityOf(prewaf.done));
							wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
							// more than 8 hrs
							wait.until(ExpectedConditions.visibilityOf(eta.startDate));
							wait.until(ExpectedConditions.elementToBeClickable(eta.startDate)).click();
							
							
//							//past date is previous month
//							wait.until(ExpectedConditions.visibilityOf(prewaf.previousMonth));
//							wait.until(ExpectedConditions.elementToBeClickable(prewaf.previousMonth)).click();
							
							
							
							wait.until(ExpectedConditions.visibilityOf(eta.pastDateELA));
							wait.until(ExpectedConditions.elementToBeClickable(eta.pastDateELA)).click();
							wait.until(ExpectedConditions.visibilityOf(prewaf.done));
							wait.until(ExpectedConditions.elementToBeClickable(prewaf.done)).click();
							wait.until(ExpectedConditions.visibilityOf(eta.etaSave));
							wait.until(ExpectedConditions.elementToBeClickable(eta.etaSave)).click();
							wait.until(ExpectedConditions.visibilityOf(eta.moreThan8Hours));
							wait.until(ExpectedConditions.elementToBeClickable(eta.moreThan8Hours)).click();
							wait.until(ExpectedConditions.visibilityOf(eta.ok));
							wait.until(ExpectedConditions.elementToBeClickable(eta.ok)).click();
							wait.until(ExpectedConditions.visibilityOf(prewaf.prewafBack));
							wait.until(ExpectedConditions.elementToBeClickable(prewaf.prewafBack)).click();
						}
					}
				}
			}
//			wait.until(ExpectedConditions.visibilityOf(workdetail.pauseStatus)).isDisplayed();
			wait.until(ExpectedConditions.visibilityOf(workdetail.startWork)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.startTravel)).isEnabled();
			wait.until(ExpectedConditions.visibilityOf(workdetail.postWaf)).isEnabled();

			wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
			wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		}
	

	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));

		driver.quit();
	}

}
