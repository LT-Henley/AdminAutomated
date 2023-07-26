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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Withdraw'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Withdraw'))

WebUI.mouseOver(findTestObject('Transaction/Withdraw/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/span_THB'))

WebUI.click(findTestObject('Transaction/Withdraw/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/h3_Withdraw'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/button_Auto Refresh'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/h3_Withdraw'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/button_Auto Refresh'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Date Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Transaction Number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Vip Level'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Bank Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Bank Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Customer Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Withdrawal Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Before'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_After'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Main'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/th_Upline'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/table_NoDate'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_No'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Date Time'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Transaction Number'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_App Type'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Vip Level'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Bank Name'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Bank Account'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Customer Name'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Withdrawal Amount'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Before'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_After'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Status'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Action'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Main'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/th_Upline'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/table_NoDate'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Withdraw/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Withdraw/li_Next'))

