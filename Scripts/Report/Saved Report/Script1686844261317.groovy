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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Saved Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Saved Report'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Saved Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/h3_Saved Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/h3_Saved Report'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Product Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Category Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Settlement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Reward'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Chip'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Adjustment'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Saved Report/table_Product'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Product Name'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Category Name'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Settlement'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Reward'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Chip'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Interest'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Adjustment'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Saved Report/table_Product'))

