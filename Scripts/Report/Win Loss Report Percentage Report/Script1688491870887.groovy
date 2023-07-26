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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/span_Win Loss Report  Report'))

WebUI.mouseOver(findTestObject('Report/Win Loss Report Percentage Report/span_Win Loss Report  Report'))

WebUI.click(findTestObject('Report/Win Loss Report Percentage Report/span_Win Loss Report  Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/h3_Win Loss Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/input_Username_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/select_AllEgames'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/select_All28win'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/select_MalaysiaThailand'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/h3_Win Loss Report'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/input_Username_username'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/select_AllEgames'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/select_All28win'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/select_MalaysiaThailand'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Deposit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Withdraw'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Valid Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Winlose'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Member Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Bonus'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Player Total'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Player Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Agent Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Total Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Player Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Agent Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Total Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Jackpot'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Topup Statement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Withdraw Statement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/th_Company Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/table_NameDeposit'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Name'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Deposit'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Withdraw'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Valid Stake'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Winlose'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Member Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Bonus'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Player Total'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Player Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Agent Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Agent - Total Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Player Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Agent Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Senior - Total Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Jackpot'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Topup Statement'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Withdraw Statement'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/th_Company Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/table_NameDeposit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Win Loss Report Percentage Report/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Win Loss Report Percentage Report/li_Next'))

