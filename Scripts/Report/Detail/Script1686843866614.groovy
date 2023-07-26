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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Detail'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Detail'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Detail'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/h3_Game Report (Detailed)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/select_MalaysiaThailand'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/h3_Game Report (Detailed)'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/select_MalaysiaThailand'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Product'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Member IGN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Category'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_US Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Local Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_US Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Local Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/th_Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/table_NoLogin'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_No'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Number'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Product'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Member IGN'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Category'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_US Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Local Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_US Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Local Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/th_Time'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/table_NoLogin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Detail/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Detail/li_Next'))

