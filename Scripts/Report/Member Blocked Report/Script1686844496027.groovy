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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Member Blocked Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Member Blocked Report'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Member Blocked Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/h3_Member Blocked Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/h3_Member Blocked Report'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/th_Account Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/th_Done By'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/th_Log Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/table_UsernameAccount'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/th_Username'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/th_Account Status'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/th_Done By'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/th_Log Datetime'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/table_UsernameAccount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Member Blocked Report/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Member Blocked Report/li_Next'))

