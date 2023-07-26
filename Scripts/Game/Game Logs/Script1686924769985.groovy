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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Game'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Page_Dashboard/span_Game Logs'))

WebUI.mouseOver(findTestObject('Game/Page_Dashboard/span_Game Logs'))

WebUI.click(findTestObject('Game/Page_Dashboard/span_Game Logs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/h3_Game Logs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/select_28WIN'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/button_Filter'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/h3_Game Logs'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/select_28WIN'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/button_Filter'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Date Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Member Product Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Params'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Return'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Message'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/th_Path'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Game/Game Logs/table_Date Time'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Date Time'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Member Product Username'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Params'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Return'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Message'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/th_Path'))

WebUI.verifyElementVisible(findTestObject('Game/Game Logs/table_Date Time'))

