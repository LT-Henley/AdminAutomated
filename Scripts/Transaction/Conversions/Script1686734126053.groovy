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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Conversions'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Conversions'))

WebUI.click(findTestObject('Transaction/Page_Dashboard/span_Conversions'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/h3_Currency Conversions'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/select_AllPlayer'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/select_AllMYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/input_Datetime Range_form-control dateRange dateFromTo'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/button_Search'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/h3_Currency Conversions'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/select_AllPlayer'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/select_AllMYR'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/input_Datetime Range_form-control dateRange dateFromTo'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_User Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Transaction Number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Exchange From'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Amount From'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Exchange To'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Amount To'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Rate'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_DateTime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/table_User'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_User Type'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Username'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Transaction Number'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Exchange From'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Amount From'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Exchange To'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Amount To'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Rate'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_DateTime'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/th_Action'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/table_User'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Currency Conversions/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Currency Conversions/li_Next'))

