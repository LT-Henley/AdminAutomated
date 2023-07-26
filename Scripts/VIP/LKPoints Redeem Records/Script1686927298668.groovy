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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Page_Dashboard/span_VIP'))

WebUI.mouseOver(findTestObject('VIP/Page_Dashboard/span_VIP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Page_Dashboard/span_LKPoints Redeem Records'))

WebUI.mouseOver(findTestObject('VIP/Page_Dashboard/span_LKPoints Redeem Records'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Pending'))

WebUI.mouseOver(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Pending'))

WebUI.click(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Pending'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/h3_LK Point Redeem Pending'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/h3_LK Point Redeem Pending'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/select_102550100'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Copy'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/span_CSV'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/span_Excel'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/span_PDF'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Gift Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Required Point'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Login Account'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Created Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/table_Gift Name'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Gift Name'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Required Point'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Login Account'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Created Datetime'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/th_Action'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/table_Gift Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/VIP_LK Point Redeem Pending/li_Next'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/li_Previous'))

WebUI.verifyElementVisible(findTestObject('VIP/VIP_LK Point Redeem Pending/li_Next'))

