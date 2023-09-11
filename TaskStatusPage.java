package au.maximo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import au.maximo.utils.TestBaseUtils;

public class TaskStatusPage extends TestBaseUtils {
	@Test
	public static void taskStatus() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 90);
		String work = "WW8488022";
		String memo = "test";

		// pm wo
		wait.until(ExpectedConditions.visibilityOf(search.woDetails));
		wait.until(ExpectedConditions.elementToBeClickable(search.woDetails)).click();
		wait.until(ExpectedConditions.visibilityOf(search.pmWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.pmWO)).click();

		// search WO
//		wait.until(ExpectedConditions.visibilityOf(search.checkForUpdates));
//		wait.until(ExpectedConditions.elementToBeClickable(search.checkForUpdates)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.visibilityOf(search.searchWO));
		wait.until(ExpectedConditions.elementToBeClickable(search.searchWO)).click();
		wait.until(ExpectedConditions.visibilityOf(search.wo)).sendKeys(work);
		wait.until(ExpectedConditions.visibilityOf(search.filter));
		wait.until(ExpectedConditions.elementToBeClickable(search.filter)).click();
		wait.until(ExpectedConditions.visibilityOf(workdetail.detailPage));
		wait.until(ExpectedConditions.elementToBeClickable(workdetail.detailPage)).click();

		// task status
		wait.until(ExpectedConditions.visibilityOf(mvp.taskTouchpoints)).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.taskTouchpoints)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatus)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.searchIncompleteTask));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.searchIncompleteTask)).sendKeys("incomplete");
		wait.until(ExpectedConditions.visibilityOf(mvp.searchTask));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.searchTask)).click();

		// listPage_Complete
		wait.until(ExpectedConditions.visibilityOf(mvp.thumbsUP));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.thumbsUP)).click();

		// listPage_NotApplicable
		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicableclose));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.notApplicableclose)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicable)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.observationwarning)).isDisplayed();

		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicableDescription));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.notApplicableDescription)).sendKeys(memo);

		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

		// listPage_FurtherWork
		wait.until(ExpectedConditions.visibilityOf(mvp.furtherWorkEdit));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.furtherWorkEdit)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.furtherWorkEdit));

		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
//		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.visibilityOf(mvp.furtherWorkRequired)).isDisplayed();
		// furtherwork feild
		wait.until(ExpectedConditions.visibilityOf(mvp.taskNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.description));
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatus));
		wait.until(ExpectedConditions.visibilityOf(mvp.observation));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetDescrption));
		wait.until(ExpectedConditions.visibilityOf(mvp.site));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetTagId));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetCodeId));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetCodeDescription));
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode));
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeDescription));
		wait.until(ExpectedConditions.visibilityOf(mvp.hsRisk));
		wait.until(ExpectedConditions.visibilityOf(mvp.taskNumber));


		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberErrormsg)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberSelection));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberSelection)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assettxt));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeErrorMsg)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode));
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeSelection));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.problemCodeSelection)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode2));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode));
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

		// detailPage_Complete

		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.incomplete)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatusChange));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.taskStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatustxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.completeStatusChange));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.completeStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.complete));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.complete)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

		// detailPage_NotApplicable
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.incomplete)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatusChange));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.taskStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatustxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicableStatusChange));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.notApplicableStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicable));
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.observationwarning)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.notApplicableDescription));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.notApplicableDescription)).sendKeys(memo);

		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

		// detailpage_FurtherWork
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.tasksDetailtxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.incomplete)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(mvp.taskStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatustxt)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.taskStatusChange));
		wait.until(ExpectedConditions.visibilityOf(mvp.furtherWorkRequiredStatusChange));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.furtherWorkRequiredStatusChange)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.furtherWorkRequired));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.furtherWorkRequired)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberErrormsg)).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(prewaf.closeErrormsg)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberSelection));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberSelection)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assettxt));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumber));
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeErrorMsg)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode));
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCodeSelection));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.problemCodeSelection)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode2));
		wait.until(ExpectedConditions.visibilityOf(mvp.assetNumberLookup));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.assetNumberLookup)).click();
		wait.until(ExpectedConditions.visibilityOf(mvp.problemCode));
		wait.until(ExpectedConditions.visibilityOf(mvp.statusSave));
		wait.until(ExpectedConditions.elementToBeClickable(mvp.statusSave)).click();

		// GOBACK DETAILPAGE
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();
		// GOBACK.IST PAGe
		wait.until(ExpectedConditions.visibilityOf(prewaf.goBack));
		wait.until(ExpectedConditions.elementToBeClickable(prewaf.goBack)).click();

	}

	@AfterTest
	public void tearDown() {
		System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
		driver.quit();
	}
}
