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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Online Payment'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Online Payment'))

WebUI.click(findTestObject('Transaction/Page_Dashboard/span_Online Payment'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/h3_Online Payment'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/button_Auto Refresh'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/h3_Online Payment'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/button_Auto Refresh'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Date Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Transaction Code'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Member Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Bank Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Bank Info'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Topup Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Before'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_After'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Receipt'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Transfer Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/table_NoDate'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_No'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Date Time'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Transaction Code'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Member Name'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Bank Name'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Bank Info'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Topup Amount'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Before'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_After'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Receipt'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Transfer Type'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Status'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/th_Action'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/table_NoDate'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Online Payment/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Page_Online Payment/li_Next'))

