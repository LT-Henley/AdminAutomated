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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Shareholder report preview'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Shareholder report preview'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/h3_Shareholder report preview'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/h3_Shareholder report preview'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/th_Category'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/th_Sales (USD, MYR - 0, THB - 0, IDR - 0, MMK - 0, RMB - 0)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/table_CategorySales'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/th_Category'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/th_Sales (USD, MYR - 0, THB - 0, IDR - 0, MMK - 0, RMB - 0)'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/table_CategorySales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Shareholder Report Preview/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Shareholder Report Preview/li_Next'))

