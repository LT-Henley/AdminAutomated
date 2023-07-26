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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_40130 Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_40130 Report'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_40130 Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/h3_Admin Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/div_Date'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/h3_Admin Report'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/div_Date'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Category'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Sales (USD)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Payout (USD)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_S - Payout (USD)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Profit (USD)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/table_CategorySales (USD)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Category'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Sales (USD)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Payout (USD)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_S - Payout (USD)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Profit (USD)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/table_CategorySales (USD)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/li_Next'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Category (1)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Platform Share'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/40130 Report/th_Platform Profit'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Account'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Category (1)'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Platform Share'))

WebUI.verifyElementVisible(findTestObject('Report/40130 Report/th_Platform Profit'))

