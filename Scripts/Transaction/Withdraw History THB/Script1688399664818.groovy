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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Withdraw history'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Withdraw history'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/span_THB'))

WebUI.click(findTestObject('Transaction/Withdraw history/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/h3_Member Withdraw History'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/select_Approve'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/button_Search'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/h3_Member Withdraw History'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/select_Approve'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/select_1050100200All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/select_1050100200All'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Date Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Update Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Trade Code'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Done By'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Receipt'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Shareholder'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Main'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/th_Upline'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/table_NoDate'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_No'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Date Time'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Update Time'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Trade Code'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Status'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Done By'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Receipt'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Action'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Shareholder'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Main'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/th_Upline'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/table_NoDate'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw history/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw history/li_Next'))

