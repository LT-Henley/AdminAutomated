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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Page_Dashboard/span_FX Rates'))

WebUI.mouseOver(findTestObject('Setting/Page_Dashboard/span_FX Rates'))

WebUI.click(findTestObject('Setting/Page_Dashboard/span_FX Rates'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/h3_FX List'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/h3_FX List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/th_Source Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/th_Target Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/th_Exchange Rate'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/table_Source'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/th_Source Currency'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/th_Target Currency'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/th_Exchange Rate'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/th_Action'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/table_Source'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/FX Rates/li_Next'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Setting/FX Rates/li_Next'))

