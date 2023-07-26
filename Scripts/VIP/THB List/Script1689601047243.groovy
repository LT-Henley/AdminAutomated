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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Page_Dashboard/span_THB'))

WebUI.mouseOver(findTestObject('VIP/Page_Dashboard/span_THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Page_Dashboard/span_List THB'))

WebUI.mouseOver(findTestObject('VIP/Page_Dashboard/span_List THB'))

WebUI.click(findTestObject('VIP/Page_Dashboard/span_List THB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/h3_VIP List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/button_Update Sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/button_Create VIP'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/h3_VIP List'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/button_Update Sequence'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/button_Create VIP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/select_102550100'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Tier name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Tier sequence'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Minimum Topup'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Minimum Stake'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Maximum Withdraw Count Per Day'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Maximum Withdraw Amount Per Withdraw'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Created At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Updated At'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/table_Tier name'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Tier name'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Tier sequence'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Minimum Topup'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Minimum Stake'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Maximum Withdraw Count Per Day'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Maximum Withdraw Amount Per Withdraw'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Created At'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Updated At'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/th_Action'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/table_Tier name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('VIP/Vip List/li_Next'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('VIP/Vip List/li_Next'))

