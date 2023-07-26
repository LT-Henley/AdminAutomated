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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Report'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Report'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Page_Dashboard/span_Summary MMK'))

WebUI.mouseOver(findTestObject('Report/Page_Dashboard/span_Summary MMK'))

WebUI.click(findTestObject('Report/Page_Dashboard/span_Summary MMK'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/h3_New Game Report (Summary)'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/div_Date'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/button_Search'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/h3_New Game Report (Summary)'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/div_Date'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Product Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Category Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Win Loss'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Settlement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Chip'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Reward'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/table_Product'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Product Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Category Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Win Loss'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Settlement'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Chip'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Reward'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Interest'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/table_Product'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/li_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/li_Next'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Product Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Category Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Currency'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Sales'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Settlement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Commission'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Chip'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Reward'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Interest'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Game'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Payout'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Profit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/table_Product'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Product Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Category Name'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Currency'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Sales'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Settlement'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Commission'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Chip'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Reward'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Interest'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Game'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Payout'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/th_Profit'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/table_Product'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/a_Next'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/button_Save Report'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/a_Next'))

WebUI.verifyElementVisible(findTestObject('Report/Summary MYR THB IDR MMK RMB/Summary 2nd Table/button_Save Report'))

