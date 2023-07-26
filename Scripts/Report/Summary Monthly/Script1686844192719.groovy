import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login Admin'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Summary Monthly'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Summary Monthly'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Summary Monthly'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/h3_New Game Report (Summary)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/select_AllMalaysia'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/h3_New Game Report (Summary)'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/select_AllMalaysia'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Product Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Category Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Win Loss'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Settlement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Reward'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Monthly/table_Product'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Product Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Category Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Win Loss'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Settlement'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Reward'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Interest'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Monthly/table_Product'))

