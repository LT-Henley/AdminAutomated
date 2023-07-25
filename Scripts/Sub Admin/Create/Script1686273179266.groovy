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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Dashboard/span_Sub-Admin'))

WebUI.mouseOver(findTestObject('Sub Admin/Page_Dashboard/span_Sub-Admin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Dashboard/span_Create'))

WebUI.mouseOver(findTestObject('Sub Admin/Page_Dashboard/span_Create'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Dashboard/span_Create'))

WebUI.click(findTestObject('Sub Admin/Page_Dashboard/span_Create'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/h3_Register New Sub-Admin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Full Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Login'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_New Password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Confirm Password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Permission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Whitelist IPs'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Access Time From'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Access Time To'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_Country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/label_App Type'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/h3_Register New Sub-Admin'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Full Name'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Login'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_New Password'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Confirm Password_confirmPassword'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Permission'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Whitelist IPs'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Access Time From'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Access Time To'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_Country'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/label_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_Full Name_name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_Login_login'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_New Password_password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_Confirm Password_confirmPassword'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/select_Add Permission                            Copy Permission'))

WebUI.waitForElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/div_Whitelist IPs_bootstrap-tagsinput'), 0)

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/div_Whitelist IPs_bootstrap-tagsinput'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_Access Time From_accessTimeFrom'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/input_Access Time To_accessTimeTo'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/div_Nothing selected_country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/div_Nothing selected_appType'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Full Name_name'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Login_login'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_New Password_password'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Confirm Password_confirmPassword'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/select_Add Permission                            Copy Permission'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/div_Whitelist IPs_bootstrap-tagsinput'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Access Time From_accessTimeFrom'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/input_Access Time To_accessTimeTo'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/div_Nothing selected_country'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/div_Nothing selected_appType'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Sub admin Register/button_Register'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Sub admin Register/button_Register'))

