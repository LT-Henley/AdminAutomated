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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_User'))

WebUI.mouseOver(findTestObject('User/Member/span_User'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/span_All Wallet'))

WebUI.mouseOver(findTestObject('User/Shareholder/span_All Wallet'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/span_THB'))

WebUI.mouseOver(findTestObject('User/Shareholder/User Wallets/span_THB'))

WebUI.click(findTestObject('User/Shareholder/User Wallets/span_THB'))

WebUI.waitForElementVisible(findTestObject('User/Shareholder/User Wallets/h3_Shareholder Wallet Report'), 
    0)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/h3_Shareholder Wallet Report'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/h3_Shareholder Wallet Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/th_Shareholder name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/th_Wallet Balance'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/th_Wallet Last Update'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/table_Shareholder name'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/th_Shareholder name'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/th_Wallet Balance'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/th_Wallet Last Update'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/th_Action'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/table_Shareholder name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User Wallets/a_Next'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/li_Previous'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User Wallets/a_Next'))

