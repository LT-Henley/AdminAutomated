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

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Page_Dashboard/span_Announcement'))

WebUI.mouseOver(findTestObject('Announcement/Page_Dashboard/span_Announcement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Page_Dashboard/span_Member'))

WebUI.mouseOver(findTestObject('Announcement/Page_Dashboard/span_Member'))

WebUI.click(findTestObject('Announcement/Page_Dashboard/span_Member'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/h3_Member Announcement List'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/select_MalaysiaThailandIndonesiaMyanmarChina'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/select_lkym5tigerhubking1678'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/button_Search'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/button_Add'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/h3_Member Announcement List'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/select_MalaysiaThailandIndonesiaMyanmarChina'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/select_lkym5tigerhubking1678'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/button_Search'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/button_Add'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/select_102550100'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/span_Copy'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/span_CSV'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/span_Excel'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/span_PDF'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/input_Search_form-control form-control-sm'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/select_102550100'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/span_Copy'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/span_CSV'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/span_Excel'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/span_PDF'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/input_Search_form-control form-control-sm'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Announcement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Title'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Cover Image'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Thumbnail Image'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Link'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Country'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Language'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Status'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Created time'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_App Type'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/th_Action'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/table_Announcement'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Announcement'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Title'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Cover Image'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Thumbnail Image'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Link'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Country'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Language'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Status'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Created time'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_App Type'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/th_Action'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/table_Announcement'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/li_Previous'))

CustomKeywords.'com.reusableComponent.HighlightElement.run'(findTestObject('Announcement/Member Announcement/a_Next'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/li_Previous'))

WebUI.verifyElementVisible(findTestObject('Announcement/Member Announcement/a_Next'))

