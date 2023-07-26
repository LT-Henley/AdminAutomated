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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Win Loss Report (All)'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Win Loss Report (All)'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Win Loss Report (All)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/h3_Win Loss Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/input_Username_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/select_AllEgames'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/select_All28win'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/select_MalaysiaThailand'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/h3_Win Loss Report'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/input_Username_username'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/select_AllEgames'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/select_All28win'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/select_MalaysiaThailand'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Nickname'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Valid Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_WinLoss'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/table_NameNickname'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Name'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Nickname'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Type'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Valid Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_WinLoss'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/th_Action'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/table_NameNickname'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report All/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report All/li_Next'))

