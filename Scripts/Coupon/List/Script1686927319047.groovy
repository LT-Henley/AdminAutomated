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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Page_Dashboard/span_Coupon'))

WebUI.mouseOver(findTestObject('Coupon/Page_Dashboard/span_Coupon'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Coupon/Page_Dashboard/span_List'))

WebUI.click(findTestObject('Coupon/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/h3_Coupon List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/select_MYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/select_alllkym5tigerhubking1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/button_Add'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/h3_Coupon List'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/select_MYR'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/select_alllkym5tigerhubking1678'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/button_Search'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Coupon Country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Coupon Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Coupon Code'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Condition'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Quantity Total'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Quantity Balance'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Valid Period'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Title  Terms'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Image'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_App Types'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Created At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Updated At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/th_Actions'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/table_Coupon'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Coupon Country'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Coupon Name'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Coupon Code'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Status'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Type'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Condition'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Quantity Total'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Quantity Balance'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Valid Period'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Title  Terms'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Image'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_App Types'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Created At'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Updated At'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/th_Actions'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/table_Coupon'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Coupon/Coupon List/li_Next'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Coupon/Coupon List/li_Next'))

