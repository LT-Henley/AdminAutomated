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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Page_Dashboard/span_Bank'))

WebUI.mouseOver(findTestObject('Bank/Page_Dashboard/span_Bank'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Bank/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/span_RMB'))

WebUI.mouseOver(findTestObject('Bank/Bank List/span_RMB'))

WebUI.click(findTestObject('Bank/Bank List/span_RMB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/h3_Edit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/button_Add'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/h3_Edit'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Account Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Account Number'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Bank Info'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Bank Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Current Balance'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Wallet Last Update'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_VIP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/table_Account Name'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Account Name'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Account Number'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Bank Info'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Bank Name'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Current Balance'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Wallet Last Update'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_VIP'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/table_Account Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Bank/Bank List/a_Next'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Bank/Bank List/a_Next'))

