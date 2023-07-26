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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_List'))

WebUI.mouseOver(findTestObject('User/Member/span_List'))

WebUI.click(findTestObject('User/Member/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Dashboard/span_MYR'))

WebUI.mouseOver(findTestObject('User/Member/Page_Dashboard/span_MYR'))

WebUI.click(findTestObject('User/Member/Page_Dashboard/span_MYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/h3_Member List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/input_Username_member_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/input_MPU_member_product_username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/input_Phone_member_phone_number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/select_All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/select_AllPlayer'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/button_Search'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/h3_Member List'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/input_Username_member_username'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/input_MPU_member_product_username'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/input_Phone_member_phone_number'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/select_All'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/select_AllPlayer'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_ID'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Full Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Nickname'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Level'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Upline Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Shareholder name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Phone'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Remarks'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Cash'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Coin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Password Otp'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Phone Otp'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Last login IP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Last login time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/table_IDNameFull NameNicknameLevelUpline NameShareholder namePhoneStatusRemarksCashCoinInterestPassword OtpPhone OtpLast login IPLast login timeApp TypeAction'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_ID'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Full Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Nickname'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Level'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Upline Name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Shareholder name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Phone'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Status'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Remarks'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Cash'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Coin'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Interest'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Password Otp'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Phone Otp'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Last login IP'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Last login time'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_App Type'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/th_Action'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/table_IDNameFull NameNicknameLevelUpline NameShareholder namePhoneStatusRemarksCashCoinInterestPassword OtpPhone OtpLast login IPLast login timeApp TypeAction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member List/a_Next'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member List/a_Next'))

