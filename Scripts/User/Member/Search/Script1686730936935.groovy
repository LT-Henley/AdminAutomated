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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/span_Search'))

WebUI.mouseOver(findTestObject('User/Member/span_Search'))

WebUI.click(findTestObject('User/Member/span_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Search/h3_Search Member'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Search/input_Member Username_name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('User/Member/Page_Member Search/button_Search'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Search/h3_Search Member'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Search/input_Member Username_name'))

WebUI.verifyElementVisible(findTestObject('User/Member/Page_Member Search/button_Search'))

