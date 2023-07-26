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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/span_Limited List'))

WebUI.mouseOver(findTestObject('User/Shareholder/span_Limited List'))

WebUI.click(findTestObject('User/Shareholder/span_Limited List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/h3_User List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/input_Username_shareholder_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/input_MPU_member_product_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/selectLevel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/selectWallet'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/button_Create Shareholder'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/h3_User List'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/input_Username_shareholder_username'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/input_MPU_member_product_username'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/selectLevel'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/selectWallet'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/button_Search'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/button_Create Shareholder'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_No'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Full Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Nickname'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Role'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Phone'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Percentage'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Cash'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Password Otp'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Phone Otp'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Last login IP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Created Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Last login time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Upline'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/th_Main Line'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Shareholder/User List/tableUserList'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_No'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Full Name'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Nickname'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Currency'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Role'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Phone'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Percentage'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Status'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Cash'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Password Otp'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Phone Otp'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Last login IP'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Created Datetime'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Last login time'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_App Type'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Action'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Upline'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/th_Main Line'))

WebUI.verifyElementVisible(findTestObject('User/Shareholder/User List/tableUserList'))

