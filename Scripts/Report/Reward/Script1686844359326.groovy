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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Reward'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Reward'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Reward'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/h3_Reward Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/div_Date Range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/select_Malaysia'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/h3_Reward Report'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/div_Date Range'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/select_Malaysia'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/select_1050100200All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/select_1050100200All'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/table_UsernameAmountType'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/th_Username'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/th_Type'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/table_UsernameAmountType'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Reward/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Reward/li_Next'))

