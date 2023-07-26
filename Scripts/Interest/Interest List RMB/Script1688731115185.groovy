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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Page_Dashboard/span_Interest'))

WebUI.mouseOver(findTestObject('Interest/Page_Dashboard/span_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Page_Dashboard/span_Interest List RMB'))

WebUI.mouseOver(findTestObject('Interest/Page_Dashboard/span_Interest List RMB'))

WebUI.click(findTestObject('Interest/Page_Dashboard/span_Interest List RMB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/h3_Finance Details'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/select_Running                            Mutual                            Canceled                            Manual Cancel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/button_Search'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/h3_Finance Details'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/select_Running                            Mutual                            Canceled                            Manual Cancel'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Interest ID'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Initial Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Balance Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Created Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Mutual Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/th_Last Update Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/table_Interest IDUsernameCurrencyInitial AmountBalance AmountStatusCreated DatetimeMutual DatetimeLast Update Datetime'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Interest ID'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Username'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Initial Amount'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Balance Amount'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Status'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Created Datetime'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Mutual Datetime'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/th_Last Update Datetime'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/table_Interest IDUsernameCurrencyInitial AmountBalance AmountStatusCreated DatetimeMutual DatetimeLast Update Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Interest/Interest List/li_Next'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Interest/Interest List/li_Next'))

