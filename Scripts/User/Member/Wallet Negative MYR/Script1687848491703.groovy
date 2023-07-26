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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_Wallet Negative'))

WebUI.mouseOver(findTestObject('User/Member/span_Wallet Negative'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/span_MYR'))

WebUI.mouseOver(findTestObject('User/Member/Wallet Negative/span_MYR'))

WebUI.click(findTestObject('User/Member/Wallet Negative/span_MYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/h3_Member Wallet Report'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/h3_Member Wallet Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/select_1050100200All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/select_1050100200All'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/th_Member Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/th_Wallet Negative'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/th_Wallet Last Update'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/table_Member Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/th_Member Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/th_Wallet Negative'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/th_Wallet Last Update'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/th_Action'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/table_Member Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Wallet Negative/li_Next'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/li_Previous'))

WebUI.verifyElementVisible(findTestObject('User/Member/Wallet Negative/li_Next'))

