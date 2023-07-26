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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Page_Dashboard/span_Banner'))

WebUI.mouseOver(findTestObject('Banner/Page_Dashboard/span_Banner'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Banner/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/span_All'))

WebUI.mouseOver(findTestObject('Banner/Banner List/span_All'))

WebUI.click(findTestObject('Banner/Banner List/span_All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/h3_Banner List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/select_lkym5tigerhubking1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/select_enchbmthvtidmy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/button_Add'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/h3_Banner List'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/select_lkym5tigerhubking1678'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/select_enchbmthvtidmy'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/button_Search'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Banner'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Video Thumbnail'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Redirect Url'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Language'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/table_Banner'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Banner'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Video Thumbnail'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Type'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Redirect Url'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Country'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Language'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_App Type'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/table_Banner'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Banner/Banner List/li_Next'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Banner/Banner List/li_Next'))

