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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Page_Dashboard/span_Logs'))

WebUI.mouseOver(findTestObject('Logs/Page_Dashboard/span_Logs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Page_Dashboard/span_Sms Logs'))

WebUI.mouseOver(findTestObject('Logs/Page_Dashboard/span_Sms Logs'))

WebUI.click(findTestObject('Logs/Page_Dashboard/span_Sms Logs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/h3_Sms Logs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/button_Search'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/h3_Sms Logs'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/th_User Id'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/th_Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/th_Message'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/table_User'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/th_User Id'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/th_Datetime'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/th_Message'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/th_Status'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/th_Type'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/table_User'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Sms Logs/li_Next'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Logs/Sms Logs/li_Next'))

