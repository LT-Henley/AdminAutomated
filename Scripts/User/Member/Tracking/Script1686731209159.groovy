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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_Tracking'))

WebUI.mouseOver(findTestObject('User/Member/span_Tracking'))

WebUI.click(findTestObject('User/Member/span_Tracking'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/h3_Member Tracking'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/select_All                                Same Username                                Same Device                                Same IP Address'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/button_Search'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/h3_Member Tracking'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/select_All                                Same Username                                Same Device                                Same IP Address'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/select_102550100'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/span_Copy'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/span_CSV'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/span_Excel'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/span_PDF'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/th_Device'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/th_IP Address'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/tableMemberTracking'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/th_Username'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/th_Device'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/th_IP Address'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/tableMemberTracking'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Tracking/a_Next'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/li_Previous'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Tracking/a_Next'))

