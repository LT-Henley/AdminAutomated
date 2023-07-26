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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Page_Dashboard/span_Maintenance'))

WebUI.mouseOver(findTestObject('Setting/Page_Dashboard/span_Maintenance'))

WebUI.click(findTestObject('Setting/Page_Dashboard/span_Maintenance'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/h3_Maintenance List'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/h3_Maintenance List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Label'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Is Scheduled'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Schedule From'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Schedule To'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/table_Type'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Type'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Status'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Label'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Is Scheduled'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Schedule From'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Schedule To'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/th_Action'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/table_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Setting/Maintenance/li_Next'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Setting/Maintenance/li_Next'))

