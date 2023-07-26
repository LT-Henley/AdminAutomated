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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/span_Create'))

WebUI.mouseOver(findTestObject('User/Shareholder/span_Create'))

WebUI.click(findTestObject('User/Shareholder/span_Create'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Register New Shareholder'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Register New Shareholder'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Full Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/New Password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Confirm Password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Account Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/App Type 2'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Percentage'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Permissions'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Full Name'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Login Account'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/New Password'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Confirm Password'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Account Currency'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/App Type'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/App Type 2'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Percentage'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/Permissions'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Full Name_name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Login Account_login'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/New Password (1)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Confirm Password (1)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/select_MYR THB IDR MMK'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/select_lky m5 tigerhub king1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/select_Normal (90130) Percentage'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/input_Percentage_shareholderTypePercentage'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/Nothing selected'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/SH Register/button_Register'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/SH Register/button_Register'))

