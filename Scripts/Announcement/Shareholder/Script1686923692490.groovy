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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Page_Dashboard/span_Announcement'))

WebUI.mouseOver(findTestObject('Announcement/Page_Dashboard/span_Announcement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Page_Dashboard/span_Shareholder'))

WebUI.mouseOver(findTestObject('Announcement/Page_Dashboard/span_Shareholder'))

WebUI.click(findTestObject('Announcement/Page_Dashboard/span_Shareholder'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/h3_Shareholder Announcement List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/select_lkym5tigerhubking1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/button_Add'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/h3_Shareholder Announcement List'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/select_lkym5tigerhubking1678'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/button_Search'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_English'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_BM'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Chinese'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Thai'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Vietnamese'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Bahasa Indonesia'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Burmese'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Created time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/table_EnglishBM'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_English'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_BM'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Chinese'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Thai'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Vietnamese'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Bahasa Indonesia'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Burmese'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Status'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Created time'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_App Type'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/th_Action'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/table_EnglishBM'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Shareholder Announcement/li_Next'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Announcement/Shareholder Announcement/li_Next'))

