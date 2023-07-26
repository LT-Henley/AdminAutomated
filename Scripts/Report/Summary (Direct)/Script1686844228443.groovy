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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Summary (Direct)'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Summary (Direct)'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Summary (Direct)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/h3_New Game Report (Summary)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/select_MalaysiaThailand'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/h3_New Game Report (Summary)'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/select_MalaysiaThailand'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Product Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Category Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Valid Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary Direct/th_Win Loss'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Product Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Category Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Valid Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Summary Direct/th_Win Loss'))

