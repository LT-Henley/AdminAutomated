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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Logs/Page_Dashboard/span_List'))

WebUI.click(findTestObject('Logs/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/h3_Logs List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/input_Username_filter-username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/button_Search'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/h3_Logs List'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/input_Username_filter-username'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/th_Admin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/th_IP Address'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/th_Path'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/th_Date'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Logs/Logs List/table_AdminIP'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/th_Admin'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/th_IP Address'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/th_Path'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/th_Date'))

WebUI.verifyElementVisible(findTestObject('Logs/Logs List/table_AdminIP'))

