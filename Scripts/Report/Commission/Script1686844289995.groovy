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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Commission'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Commission'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/h3_Commission Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/select_MalaysiaThailand'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/h3_Commission Report'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/select_MalaysiaThailand'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/table_Username'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/th_Username'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/th_Type'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/table_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Commission/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Commission/li_Next'))

