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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_SUNCITY - Login/h3_Sign In To Admin System'), 'Sign In To Admin System')

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/h3_Sign In To Admin System'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/input_Sign In To Admin System_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/input_Sign In To Admin System_password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_SUNCITY - Login/input_Sign In To Admin System_username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Login/Page_SUNCITY - Login/input_Sign In To Admin System_password'), GlobalVariable.Password)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/button_Next'))

WebUI.click(findTestObject('Object Repository/Login/Page_SUNCITY - Login/button_Next'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/input_Next_verificationCode'))

WebUI.setText(findTestObject('Object Repository/Login/Page_SUNCITY - Login/input_Next_verificationCode'), GlobalVariable.VerificationCode)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_SUNCITY - Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Login/Page_SUNCITY - Login/button_Sign In'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_Dashboard/h2_Login Success'))

WebUI.click(findTestObject('Object Repository/Login/Page_Dashboard/h2_Login Success'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Login/Page_Dashboard/button_OK'))

WebUI.click(findTestObject('Object Repository/Login/Page_Dashboard/button_OK'))

