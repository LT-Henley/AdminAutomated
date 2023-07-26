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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Topup history'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Topup history'))

WebUI.mouseOver(findTestObject('Transaction/Topup History/span_IDR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/span_IDR'))

WebUI.click(findTestObject('Transaction/Topup History/span_IDR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/h3_Member Topup History'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/select_Approve'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/button_Search'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/h3_Member Topup History'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/select_Approve'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/select_1050100200All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/select_1050100200All'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Topup Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Approved Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Trade Code'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Bank Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Bank Info'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Topup Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Done By'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Receipt'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Transfer Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Shareholder'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Main'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/th_Upline'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/table_NoTopup'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_No'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Topup Datetime'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Approved Datetime'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Trade Code'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Bank Name'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Bank Info'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Topup Amount'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Status'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Done By'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Receipt'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Transfer Type'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Action'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Shareholder'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Main'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/th_Upline'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/table_NoTopup'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Topup History/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Topup History/li_Next'))

