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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_User'))

WebUI.mouseOver(findTestObject('User/Member/span_User'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_Wallet Positive'))

WebUI.mouseOver(findTestObject('User/Member/span_Wallet Positive'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/span_THB'))

WebUI.click(findTestObject('User/Member/Wallet Positive/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/h3_Member Wallet Report'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/h3_Member Wallet Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/select_1050100200All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/select_1050100200All'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/th_Member Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/th_Wallet Positive'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/th_Wallet Last Update'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/table_Member Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/th_Member Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/th_Wallet Positive'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/th_Wallet Last Update'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Positive/a_Next'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/li_Previous'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Positive/a_Next'))

