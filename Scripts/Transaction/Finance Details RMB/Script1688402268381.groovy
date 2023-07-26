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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Transaction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Page_Dashboard/span_Finance Details'))

WebUI.mouseOver(findTestObject('Transaction/Page_Dashboard/span_Finance Details'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/span_RMB'))

WebUI.mouseOver(findTestObject('Transaction/Finance Details/span_RMB'))

WebUI.click(findTestObject('Transaction/Finance Details/span_RMB'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/h3_Finance Details'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/select_All'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/select_All_adjustment'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/input_Date Range_form-control date_range'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/button_Search'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/h3_Finance Details'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/select_All'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/select_All_adjustment'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/input_Date Range_form-control date_range'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Username'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Amount'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Before'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_After'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Remark'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_CoinCash'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Method'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_IP Address'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/th_Time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/table_TypeUsername'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Type'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Username'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Amount'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Before'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_After'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Remark'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_CoinCash'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Method'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_IP Address'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/th_Time'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/table_TypeUsername'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Transaction/Finance Details/li_Next'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Transaction/Finance Details/li_Next'))

