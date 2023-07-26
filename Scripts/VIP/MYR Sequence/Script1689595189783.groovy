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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Page_Dashboard/span_MYR'))

WebUI.mouseOver(findTestObject('VIP/Page_Dashboard/span_MYR'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/span_Sequence'))

WebUI.mouseOver(findTestObject('VIP/Vip List/span_Sequence'))

WebUI.click(findTestObject('VIP/Vip List/span_Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/h3_Vip Update Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/h4_To change sequence, drag the VIP level to the section of your choice'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 0'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 1'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 2'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 3'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 4'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 5'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_VIP 6'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/span_7'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip Sequence/button_Back to VIP List'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/h3_Vip Update Sequence'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/h4_To change sequence, drag the VIP level to the section of your choice'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 0'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 1'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 2'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 3'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 4'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 5'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_VIP 6'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/span_7'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip Sequence/button_Back to VIP List'))

