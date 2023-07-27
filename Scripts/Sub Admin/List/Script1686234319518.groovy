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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Dashboard/span_List'))

WebUI.mouseOver(findTestObject('Sub Admin/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Dashboard/span_List'))

WebUI.click(findTestObject('Sub Admin/Page_Dashboard/span_List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/h3_Admin List'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/h3_Admin List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/button_Create Admin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/button_Create Admin'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/button_Create Admin'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Name'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Created Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Last Login Datetime'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Last login IP'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Account Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/th_Action'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Name'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Country'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_App Type'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Created Datetime'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Last Login Datetime'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Last login IP'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Account Status'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/table_NameCountryApp TypeCreated DatetimeLast Login DatetimeLast login IPAccount StatusAction'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/table_NameCountryApp TypeCreated DatetimeLast Login DatetimeLast login IPAccount StatusAction'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/Action Buttons/td_Block                            Delete                            Password                            Edit'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Block'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Delete'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Password'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/Action Buttons/td_Block                            Delete                            Password                            Edit'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Block'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Delete'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/Action Buttons/button_Password'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Sub Admin/Page_Admin List/a_Next'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Sub Admin/Page_Admin List/a_Next'))

WebUI.closeBrowser()

