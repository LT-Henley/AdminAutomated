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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Gift Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Gift Report'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Gift Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/h3_Gift Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/h3_Gift Report'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/th_Gift Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/th_Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/table_UsernameGift'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/th_Username'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/th_Gift Name'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/th_Datetime'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/table_UsernameGift'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Gift Report/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Gift Report/li_Next'))

