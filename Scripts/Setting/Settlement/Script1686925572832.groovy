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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Page_Dashboard/span_Setting'))

WebUI.mouseOver(findTestObject('Setting/Page_Dashboard/span_Setting'))

WebUI.waitForElementPresent(findTestObject('Setting/Page_Dashboard/span_Settlement'), 0)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Page_Dashboard/span_Settlement'))

WebUI.mouseOver(findTestObject('Setting/Page_Dashboard/span_Settlement'))

WebUI.click(findTestObject('Setting/Page_Dashboard/span_Settlement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/h3_Settlement List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/div_Date'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/button_Add'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/h3_Settlement List'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/div_Date'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/button_Search'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/th_Date'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/table_DateAmountAction'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/th_Date'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/th_Action'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/table_DateAmountAction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Settlement/li_Next'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Setting/Settlement/li_Next'))

